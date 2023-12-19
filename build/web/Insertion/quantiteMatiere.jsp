
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.Matiere"%>

<%
    Matiere[] listematiere = (Matiere[])request.getAttribute("listematiere");
%>

<%@include file="./../Layout/header.jsp" %>


  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Insertion</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/Layout/index.jsp">Accueil</a></li>
          <li class="breadcrumb-item active">Style</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class=" offset-3 col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Insertion quantité </h5>

              <!-- General Form Elements -->
              <form action="${pageContext.request.contextPath}/InsertionStyle" method="get">
                <div class="row mb-3 mt-3">
                  <label for="inputText" class="col-form-label offset-1 h3">Meuble</label>
                  <div class=" offset-1 col-sm-10" id="meuble">
                      <select name='meuble' class='form-select' placeholder='Choisir le meuble'>
                      </select>
                  </div>
                </div>
                  
                <div class="row mb-3 mt-2">
                  <label for="inputText" class="col-form-label offset-1 h3">Volume</label>
                  <div class=" offset-1 col-sm-10">
                      <select name='volume' class='form-select' placeholder='Choisir le volume'>
                          <option disable> veuillez choisir le volume </option>
                      </select> 
                  </div>
                </div>
                
                <div class="row mb-3 mt-2">
                  <label for="inputText" class="col-form-label offset-1 h3">Matière </label>
                  <div class=" offset-1 col-sm-10">
                      <select name='matiere' class='form-select' placeholder='Choisir le matière'>
                      </select>
                  </div>
                </div>
                
                <div class="row mb-3 mt-5">
                  <label for="inputText" class="col-form-label offset-1 h3">Quantité</label>
                  <div class=" offset-1 col-sm-10">
                      <input type="number" class="form-control" placeholder="Entrer le nom du style" name="quantite">
                  </div>
                </div>
                  
                <div class="row mb-3 mt-5">
                  <div class="offset-5 col-sm-10">
                    <button type="submit" class="btn btn-primary">Valider</button>
                  </div>
                </div>

              </form><!-- End General Form Elements -->

            </div>
          </div>

        </div>
      </div>
    </section>

  </main><!-- End #main -->
    <script>
        function InitalizeCategorie() { 
                var xhr = getXMLHttpRequest();

                xhr.onreadystatechange  = function() { 
                    if(xhr.readyState  == 4){
                        if(xhr.status  == 200) {
                            var retour = JSON.parse(xhr.responseText);
                            var meuble = document.getElementById('meuble');
                            meuble.innerHTML = "";
                            var placeholder = createOptionElement("", "Veuillez choisir une categorie ");
                            meuble.appendChild(placeholder);
                            for (var i = 0; i < retour.length; i++) {
                                var createOption = createOptionElement(retour[i].idcategorie, retour[i].name);
                                meuble.appendChild(createOption);
                            }
                            document.getElementById('meuble').removeAttribute('onclick');
                            categorie.addEventListener('change', showProduit);
                        } else {
                            document.categorie="Error code " + xhr.status;
                        }
                    }
                };
                xhr.open("GET", "trait.php?action=1",  true); 
                xhr.send(null); 
            }
        
    </script>
  <%@include file="./../Layout/footer.jsp" %>
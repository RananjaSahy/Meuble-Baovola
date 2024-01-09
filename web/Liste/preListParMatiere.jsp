
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.Matiere"%>

<%
    Matiere[] matieres = (Matiere[])request.getAttribute("matieres");
%>

<%@include file="./../Layout/header.jsp" %>


  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Insertion</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/Layout/index.jsp">Accueil</a></li>
          <li class="breadcrumb-item active">Quantite matiere</li>
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
              <form action="${pageContext.request.contextPath}/ListParMatiere" method="get">
                
                <div class="row mb-3 mt-2">
                  <label for="inputText" class="col-form-label offset-1 h3">Matière</label>
                  <div class=" offset-1 col-sm-10">
                      <select name='idmatiere' class='form-select' placeholder='Choisir le matière' required>
                          <option disable> Veuillez choisir la matière </option>
                          <% for(Matiere mat : matieres){ %>
                          <option value="<%=mat.getIdmatiere()%>"><%=mat.getNom()%></option>                          
                            <% } %>
                      </select>
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
  <%@include file="./../Layout/footer.jsp" %>
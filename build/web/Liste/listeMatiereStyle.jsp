<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./../Layout/header.jsp" %>


  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Liste</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="../Layout/index.jsp">Accueil</a></li>
          <li class="breadcrumb-item active">Tableau liste style/matière</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class=" offset-2 col-lg-8">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Tableau liste style/matière</h5>
                  <p><code> Voici la liste de tout les styles et de des matière utilisée</code> </p>
                  <!-- Bordered Table -->
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th scope="col">Style</th>
                        <th scope="col">Matière possible</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <th scope="row">Nom_style_1</th>
                        <td>
                          <p> Matière_1 </p>
                          <p> Matière_2 </p>
                          <p> Matière_3 </p>
                        </td>
                      </tr>
                      <tr>
                        <th scope="row">Nom_style_1</th>
                        <td>
                          <p> Matière_1 </p>
                          <p> Matière_2 </p>
                          <p> Matière_3 </p>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                  <!-- End Bordered Table -->
        </div>
      </div>
    </section>

  </main><!-- End #main -->

  <%@include file="./../Layout/footer.jsp" %>

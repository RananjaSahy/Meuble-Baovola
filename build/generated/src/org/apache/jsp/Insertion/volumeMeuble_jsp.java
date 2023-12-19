package org.apache.jsp.Insertion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Matiere;

public final class volumeMeuble_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Insertion/./../Layout/header.jsp");
    _jspx_dependants.add("/Insertion/./../Layout/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Matiere[] listematiere = (Matiere[])request.getAttribute("listematiere");

      out.write('\n');
      out.write('\n');
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("  <title>Meuble</title>\r\n");
      out.write("  <meta content=\"\" name=\"description\">\r\n");
      out.write("  <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor CSS Files -->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main CSS File -->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- =======================================================\r\n");
      out.write("  * Template Name: NiceAdmin\r\n");
      out.write("  * Updated: Nov 17 2023 with Bootstrap v5.3.2\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- ======= Header ======= -->\r\n");
      out.write("  <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("      <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Layout/index.jsp\" class=\"logo d-flex align-items-center\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/img/logo.png\" alt=\"\">\r\n");
      out.write("        <span class=\"d-none d-lg-block\">Gestion de Matière</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <i class=\"bi bi-list toggle-sidebar-btn\"></i>\r\n");
      out.write("    </div><!-- End Logo -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"search-bar\">\r\n");
      out.write("      <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"#\">\r\n");
      out.write("        <input type=\"text\" name=\"query\" placeholder=\"Search\" title=\"Enter search keyword\">\r\n");
      out.write("        <button type=\"submit\" title=\"Search\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div><!-- End Search Bar -->\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"header-nav ms-auto\">\r\n");
      out.write("      <ul class=\"d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item d-block d-lg-none\">\r\n");
      out.write("          <a class=\"nav-link nav-icon search-bar-toggle \" href=\"#\">\r\n");
      out.write("            <i class=\"bi bi-search\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li><!-- End Search Icon-->\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav><!-- End Icons Navigation -->\r\n");
      out.write("\r\n");
      out.write("  </header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("  <!-- ======= Sidebar ======= -->\r\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("      <li class=\"nav-heading\">Pages</li>\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link \" data-bs-target=\"#forms-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"bi bi-journal-text\"></i><span>Insertion</span><i class=\"bi bi-chevron-down ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"forms-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Insertion/matiereInsertion.jsp\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span> Matière </span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PreInsertionStyle\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span> Style </span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link \" data-bs-target=\"#liste-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"bi bi-layout-text-window-reverse\"></i><span>Liste</span><i class=\"bi bi-chevron-down ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"liste-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PreListeStyle\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Liste styles</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- End Forms Nav -->\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("  </aside><!-- End Sidebar-->\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <main id=\"main\" class=\"main\">\n");
      out.write("\n");
      out.write("    <div class=\"pagetitle\">\n");
      out.write("      <h1>Insertion</h1>\n");
      out.write("      <nav>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Layout/index.jsp\">Accueil</a></li>\n");
      out.write("          <li class=\"breadcrumb-item active\">Style</li>\n");
      out.write("        </ol>\n");
      out.write("      </nav>\n");
      out.write("    </div><!-- End Page Title -->\n");
      out.write("\n");
      out.write("    <section class=\"section\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\" offset-3 col-lg-6\">\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h5 class=\"card-title\">Insertion Style</h5>\n");
      out.write("\n");
      out.write("              <!-- General Form Elements -->\n");
      out.write("              <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/InsertionStyle\" method=\"get\">\n");
      out.write("                <div class=\"row mb-3 mt-5\">\n");
      out.write("                  <label for=\"inputText\" class=\"col-form-label offset-1 h3\">Meuble</label>\n");
      out.write("                  <div class=\" offset-1 col-sm-10\">\n");
      out.write("                      <select name='meuble' class='form-select'>\n");
      out.write("                      </select>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"row mb-3 mt-5\">\n");
      out.write("                  <label for=\"inputText\" class=\"col-form-label offset-1 h3\">Nom</label>\n");
      out.write("                  <div class=\" offset-1 col-sm-10\">\n");
      out.write("                      <input type=\"text\" class=\"form-control\" placeholder=\"Entrer le nom\" name=\"nom\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"row mb-3 mt-5\">\n");
      out.write("                  <div class=\"offset-5 col-sm-10\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Valider</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </form><!-- End General Form Elements -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer id=\"footer\" class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("  </footer><!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor JS Files -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/apexcharts/apexcharts.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/chart.js/chart.umd.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/echarts/echarts.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/quill/quill.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/simple-datatables/simple-datatables.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/tinymce/tinymce.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main JS File -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

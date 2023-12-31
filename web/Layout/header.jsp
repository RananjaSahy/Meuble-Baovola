<html>

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Meuble</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="${pageContext.request.contextPath}/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/quill/quill.snow.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/vendor/simple-datatables/style.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: NiceAdmin
        * Updated: Nov 17 2023 with Bootstrap v5.3.2
        * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="header fixed-top d-flex align-items-center">

            <div class="d-flex align-items-center justify-content-between">
                <a href="${pageContext.request.contextPath}/Layout/index.jsp" class="logo d-flex align-items-center">
                    <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
                    <span class="d-none d-lg-block">Gestion de Mati�re</span>
                </a>
                <i class="bi bi-list toggle-sidebar-btn"></i>
            </div><!-- End Logo -->

            <div class="search-bar">
                <form class="search-form d-flex align-items-center" method="POST" action="#">
                    <input type="text" name="query" placeholder="Search" title="Enter search keyword">
                    <button type="submit" title="Search"><i class="bi bi-search"></i></button>
                </form>
            </div><!-- End Search Bar -->

            <nav class="header-nav ms-auto">
                <ul class="d-flex align-items-center">

                    <li class="nav-item d-block d-lg-none">
                        <a class="nav-link nav-icon search-bar-toggle " href="#">
                            <i class="bi bi-search"></i>
                        </a>
                    </li><!-- End Search Icon-->



                </ul>
            </nav><!-- End Icons Navigation -->

        </header><!-- End Header -->

        <!-- ======= Sidebar ======= -->
        <aside id="sidebar" class="sidebar">

            <ul class="sidebar-nav" id="sidebar-nav">
                <li class="nav-heading">Pages</li>

                <li class="nav-item">
                    <a class="nav-link " data-bs-target="#forms-nav" data-bs-toggle="collapse" href="#">
                        <i class="bi bi-journal-text"></i><span>Insertion</span><i class="bi bi-chevron-down ms-auto"></i>
                    </a>
                    <ul id="forms-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">

                        <li>
                            <a href="${pageContext.request.contextPath}/Insertion/categorieInsertion.jsp">
                                <i class="bi bi-circle"></i><span> Cat�gorie </span>
                            </a>
                        </li>
                        <li>

                            <a href="${pageContext.request.contextPath}/Insertion/matiereInsertion.jsp">
                                <i class="bi bi-circle"></i><span> Mati�re </span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/PreInsertionStyle">
                                <i class="bi bi-circle"></i><span> Style </span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/Insertion/volume.jsp">
                                <i class="bi bi-circle"></i><span> Volume </span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/PreInsertionQuantiteMatiere">
                                <i class="bi bi-circle"></i><span> Quantit� Mati�re </span>
                            </a>
                        </li>

                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link " data-bs-target="#liste-nav" data-bs-toggle="collapse" href="#">
                        <i class="bi bi-layout-text-window-reverse"></i><span>Liste</span><i class="bi bi-chevron-down ms-auto"></i>
                    </a>
                    <ul id="liste-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
                        <li>
                            <a href="${pageContext.request.contextPath}/PreListeStyle">
                                <i class="bi bi-circle"></i><span>Liste styles</span>
                            </a>
                        </li>
                    </ul>
                </li>

                <!-- End Forms Nav -->

            </ul>

        </aside><!-- End Sidebar-->

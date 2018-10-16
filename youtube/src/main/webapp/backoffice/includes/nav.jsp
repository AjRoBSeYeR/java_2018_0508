<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top menuHorizontal" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="inicio">Administración</a>
                <a href="../logout" class="navbar-brand cerrarSesion">Cerrar sesión</a> 
            </div>
            <!-- /.navbar-header -->

            
            <div class="navbar-default sidebar col-lg-3" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        
                        <li>
                            <a href="inicio" class="dashboard"><i class="fas fa-home"></i> Dashboard</a>
                        </li>
                        
                        <li>
                            <a href="usuarios"><i class="fas fa-users"></i> Usuarios</a>
                        </li>
                        
                        <li>
                            <a href="videos" class="video"><i class="fab fa-youtube"></i> Videos</a>
                        </li>
                        
                        <li>
                            <a href="roles" class="rol"><i class="fas fa-address-card"></i> Roles</a>
                        </li>
                        
                        <li>
                            <a href="comentarios/aprobar" class="comentario"><i class="fas fa-comments"></i> Comentarios</a>
                        </li>
                        
                        
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
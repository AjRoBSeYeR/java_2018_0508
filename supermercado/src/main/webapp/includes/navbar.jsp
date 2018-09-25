<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<header id="top">

            <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
                <a class="navbar-brand" href="home"><img src="images/logo.jpg" alt="logotipo-supermercado-el-fuerte" /></a>

                <div class="navbar-collapse" id="navbarCollapse">
                
                <c:if test="${empty sessionScope.usuario }">
                
                    <ul class="navbar-nav mr-auto menu">

                        <li class="nav-item">
                            <a class="nav-link" href="home">Inicio <span class="sr-only">(current)</span></a>
                        </li>

                        <li class="nav-item inicio-cierre-sesion">
                            <a class="nav-link" href="login.jsp">Iniciar sesión</a>
                        </li>

                    </ul>
                    
                </c:if>
                
                <c:if test="${not empty sessionScope.usuario }">
                
                    <ul class="navbar-nav mr-auto menu">

                        <li class="nav-item">
                            <a class="nav-link" href="home">Inicio <span class="sr-only">(current)</span></a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="privado/alta-producto.jsp">Nuevo producto</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="listado">Listado</a>
                        </li>

                        <li class="nav-item inicio-cierre-sesion">
                            <a class="nav-link cerrarSesion" href="logout">Cerrar sesión</a>
                        </li>

                    </ul>
                    
                </c:if>
                
                </div>

            </nav>

        </header>
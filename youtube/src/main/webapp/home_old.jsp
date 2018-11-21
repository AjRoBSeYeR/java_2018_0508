<!-- Directivas para usar Tags el prefijo es  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="com.ipartek.formacion.pojo.Usuario"%>
<%@page import="com.ipartek.formacion.pojo.Comentarios"%>
<%@page import="com.ipartek.formacion.pojo.Alerts"%>
<%@page import="com.ipartek.formacion.pojo.Video"%>
<%@page import="com.ipartek.formacion.youtube.controller.VideoYoutubeController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html lang="en">

  <head>

	<!-- Comenza todas las URLs desde el href indicado -->
	<base href="<%=request.getContextPath()%>/">
	
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Registro de usuarios</title>

	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
	
    <!-- Bootstrap core CSS -->
    <link href="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://blackrockdigital.github.io/startbootstrap-shop-item/css/shop-item.css" rel="stylesheet">
	<!-- Fontawasome -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	<!-- Estilos propios pero no termina de cogerlos -->
	<link rel="stylesheet" href="css/styles.css" >
	 <!-- Bootstrap core JavaScript -->
    <script src="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/jquery/jquery.min.js"></script>
    <script src="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="js/home.js"></script>
	

  </head>

  <body>
	<!-- Ejemplo Etiquetas jsp   -->
	<%-- <%
		Usuario bean = new Usuario();
		bean.setNombre("test");
		out.print("<p>"+ bean.getNombre() +"</p>");
	%>
	
	<jsp:useBean  id="bean2" scope="page" class="com.ipartek.formacion.pojo.Usuario"></jsp:useBean>
	<jsp:setProperty property="nombre" name="bean2" value="Marianiko el short"/>
	<jsp:getProperty property="nombre" name="bean2"/> --%>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Youtube PlayList</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
            
            <% 
            	//Gestion Usuario Logeado   
            	Usuario usuario = (Usuario)session.getAttribute("usuario");
            	if ( usuario == null ){            
            %>	            
              <!-- formulario Login -->
              <form action="login" method="post" class="form-inline mt-2 mt-md-0">
	            <input id="usuario" name="usuario" class="form-control mr-sm-2" type="text" placeholder="Nombre Usuario" required pattern=".{3,30}">
	            <input name="pass" class="form-control mr-sm-2" type="password" placeholder="Contraseña" required pattern=".{2,50}">
	            <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Entrar</button>
	          </form>            
            <%
            	} else {
            %>              
              <!-- formulario Crear Video -->
              
              <form action="" method="post" class="form-inline mt-2 mt-md-0">
	            <input name="id" class="form-control mr-sm-2" type="text" placeholder="ID 11 caracerteres" title="11 caracteres" required pattern=".{11,11}">
	            <input name="nombre" class="form-control mr-sm-2" type="text" placeholder="Nombre minimo 2 letras" required pattern=".{2,125}">
	            <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Añadir</button>
	           
	          </form>	  
				     
	          
	          
            </li>      
            <li>
            	 <i class="fas fa-user" style="color:red; margin-left:5px;"> <%=usuario.getNombre() %> </i>
	            <a href="logout">Cerrar Sesion</a>
	             <a href="backoffice/index.jsp">Backoffice</a>
            </li> 
            <%
            	} 
              %>       
          </ul>
          
          
          
        </div>
      </div>
    </nav>

    <!-- Page Content -->
    <div class="container">
    
      <%
      	//Gestion de Alertas para el usuario      	
        Alerts alert = (Alerts)request.getAttribute("alert");
      	if ( alert == null ){
      		alert = (Alerts)session.getAttribute("alert");
      		session.setAttribute("alert", null); // eliminar atributo de session
      	}
      
      	if( alert != null){
      	%>
      		<div class="container">
				<div class="alert <%=alert.getTipo()%> alert-dismissible fade show" role="alert">
				  <p><%=alert.getTexto()%></p>
				  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				    <span aria-hidden="true">&times;</span>
				  </button>
				</div>
			</div>
      	<%	
      	}      
      %>	
    

      <div class="row">

        <div class="col-lg-3">        	
          <h1 class="my-4">Lista Reproduccion</h1>
          <ul class="list-group">
          	<%
          		ArrayList<Video> videos = (ArrayList<Video>) request.getAttribute("videos");
          		if ( videos == null ){
          			videos = new ArrayList<Video>();
          		}
          		
          		Video videoInicio = (Video)request.getAttribute("videoInicio");
          		if ( videoInicio == null){
          			videoInicio = new Video();
          		}
    			
          		for( Video v : videos ){
          	%>
	            <li class="list-group-item d-flex justify-content-between align-items-center">     
	          	  	<a href="inicio?id=<%=v.getId()%>"><%=v.getNombreCancion()%></a>
	          	  	<%
		          		if(session.getAttribute("usuario") != null){
		          		
		         	 %>	
	          	  	<a href="inicio?id=<%=v.getId()%>&op=<%=VideoYoutubeController.OP_ELIMINAR%>"><i style="color:red;" class="float-right fas fa-trash-alt"></i></a>
	          	  	<%
		          		}
	          	  	%>
	            </li>
            <%
          		} //end for
            %>
            </ul>
            <%
            if ( usuario != null ){
            	
           
            %>
            	<h2 class="my-4">Historial de Reproduccion</h1>
	          	<ul class="list-group">
	          	<%
		      		ArrayList<Video> listaVideos= (ArrayList<Video>) request.getAttribute("listaVideos");
		      		if(listaVideos != null){
		      			for(Video v: listaVideos){
      					
      			%>
      				<li class="list-group-item d-flex justify-content-between align-items-center">     
	          	  	<a href="?id=<%=v.getId()%>"><%=v.getNombreCancion()%></a>
	          	  	
	           		 </li>
            	<%
      			
      					}
      				}
      			%>
	            </ul>
            <%
            }else{
            	 %>
            	  <p>Por favor identifíquese primero o regístrese en  <a href="registroUsuariosFormulario.jsp">Nuevo usuario</a></p>
            	  <%
            }
            	  %>
            
           
            
          </div>
        
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

          <div class="card mt-4">
          	<!-- Lo saco del iframe width="823" height="415" -->
            <iframe id="iframe" width="823" height="415" src="https://www.youtube.com/embed/<%=videoInicio.getId()%>?autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
            
            <div class="card-body">
              <h3 class="card-title"><%=videoInicio.getNombreCancion()%></h3>              
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente dicta fugit fugiat hic aliquam itaque facere, soluta. Totam id dolores, sint aperiam sequi pariatur praesentium animi perspiciatis molestias iure, ducimus!</p>
              <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
              4.0 stars
            </div>
          </div>
          <!-- /.card -->
          <%
          	if(session.getAttribute("usuario") != null){
          		
          %>	
		<!-- ****** COMENTARIOS ****** -->
          <div class="card card-outline-secondary my-4">
            <div class="card-header">
              <button type="button" class="btn btn-dark" onclick="visibleTextArea()">Comentarios</button>
            </div>
            <div id="comentarios" class="comentarios" style="display:none;">
	            <form action="ComentariosControler" method="post">
	            	<%-- <p name="videoId" value="<%=videoInicio.getId()%>"><%=videoInicio.getId()%></p> --%>
	            	<textarea name=text rows="" cols="88"></textarea>
	            	<!-- <input id="textArea" name="text" ></input> -->
	            	<!-- <p><a href="ComentariosControler" class="badge badge-dark">Añadir comentario</a></p> -->
	            	<input name="videoId" id="videoId" value="<%=videoInicio.getId()%>"></input>
	            	<p><button  type="submit" class="btn btn-primary">Date de alta</button></p>
	            </form>
            </div>
            <%
            	//ArrayList<Comentarios> comentarios = (ArrayList<Comentarios>) request.getAttribute("comentarios");
            	//ArrayList<Comentarios> comentarios = (ArrayList<Comentarios>)session.getAttribute("comentarios");
            	ArrayList<Comentarios> comentarios = videoInicio.getComentarios();
            	if(comentarios != null){
     		%>
     			<div class="card-body">
     				<% 
            		for (Comentarios c: comentarios){
            			if (c.getVideoId().contentEquals(videoInicio.getId())){
            				
       				%>				
            				<p><%=c.getComentario() %></p>
				              <small class="text-muted">Posted by <%=c.getAutor() %></small>
				              <hr>
				            </div>     
			<%
						}
					}
            	}
				
			%>	                       
		<%		            
            }
          %> 
          </div>
          <!-- /.card -->
         
        </div>
        <!-- /.col-lg-9 -->
      </div>
    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white"></p><!-- Copyright &copy; Your Website 2017 -->
      </div>
      <!-- /.container -->
    </footer>

   

  </body>

</html>
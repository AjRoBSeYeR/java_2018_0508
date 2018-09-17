<%@page import="com.ipartek.formacion.youtube.pojo.Usuario"%>
<%@page import="com.ipartek.formacion.youtube.pojo.Alert"%>
<%@page import="com.ipartek.formacion.youtube.controller.HomeController"%>
<%@page import="com.ipartek.formacion.youtube.pojo.Video"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html lang="en">

  <head>

	<!--  Etiqueta que comienza las URLs desde el href indicado -->
	<base href="<%=request.getContextPath()%>/">
	
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Youtube Video PlayList</title>

	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
	
    <!-- Bootstrap core CSS -->
    <link href="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://blackrockdigital.github.io/startbootstrap-shop-item/css/shop-item.css" rel="stylesheet">

	<link href="css/styles.css" rel="stylesheet">
  </head>

  <body>
  
  <%@include file="include/alert.jsp"%>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
     
        <a class="navbar-brand" href="#">Lista de Reproducci�n de Youtube</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse align-middle" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
            
            <%
            
            // Gesti�n para el login
            Usuario user = (Usuario) session.getAttribute("usuario");
           
            if (user == null) { %> 
           
            <!--  Fomulario para login -->
             <form action="login" method="post" class="form-inline mt-2 mt-md-0">
	            <input name="user" class="form-control mr-sm-2" type="text" placeholder="Nombre usuario" required pattern=".{3,30}">
	            <input name="psw" class="form-control mr-sm-2" type="password" placeholder="Contrase�a" required pattern=".{2,50}">
	            <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Entrar</button>
	            <span class="ml-3"><i class="fas fa-user-times"></i></span>
	         </form>
            
            <% } else { %>		
            
            <!--  Fomulario para insertar video -->
             <form action="" method="post" class="form-inline mt-2 mt-md-0"> 
	      
	            <input name="id" class="form-control mr-sm-2" type="text" placeholder="ID (11 caracteres)" title="11 caracteres" required pattern=".{11,11}">
	            <input name="nombre" class="form-control mr-sm-2" type="text" placeholder="T�tulo (m�n. 2 caract.)" required pattern=".{2,125}">
	            <button class="btn btn-outline-info my-2 my-sm-0" type="submit">A�adir</button>
	            <span class="ml-3"><i class="fas fa-user"></i></span>
	            <span class="ml-2">${usuario.user}</span>
	            <a href="logout" class="ml-2"><i class="fas fa-power-off"></i></a>
	         </form>
            
           <% } %> 
	         
            </li>            
          </ul>  
           
        </div>
      </div>
    </nav>

    <!-- Page Content -->
    <div class="container">

      <div class="row">

        <div class="col-lg-3">        	
          <h1 class="my-2">Lista de Reproduccion</h1>
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
	          	  	<a href="?id=<%=v.getId()%>"><%=v.getNombre()%></a>
	          	  	<a href="?id=<%=v.getId()%>&op=<%=HomeController.OP_ELIMINAR%>"><i style="color:red;" class="float-right fas fa-trash-alt"></i></a>
	            </li>
            <%
          		} //End FOR
            %>
            </ul>
            
          </div>
          
           <div class="col-lg-3">        	
          <h1 class="my-2">�ltimas reproducciones</h1>
          <ul class="list-group">
          	<%
          		ArrayList<Video> historial = (ArrayList<Video>) session.getAttribute("historial");
          		historial.add(videoInicio);
  	
          		for( Video v : historial ){
          	%>
	            <li class="list-group-item d-flex justify-content-between align-items-center">     
	          	  	<a href="?id=<%=v.getId()%>"><%=v.getNombre()%></a>
	          	  	<a href="?id=<%=v.getId()%>&op=<%=HomeController.OP_ELIMINAR%>"><i style="color:red;" class="float-right fas fa-trash-alt"></i></a>
	            </li>
            <%
          		} //End FOR
            %>
            </ul>
            
          </div>
        
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

          <div class="card mt-4">
          
            <iframe id="iframe" width="823" height="415" src="https://www.youtube.com/embed/<%=videoInicio.getId()%>?autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
            
            <div class="card-body">
              <h3 class="card-title"><%=videoInicio.getNombre()%></h3>              
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente dicta fugit fugiat hic aliquam itaque facere, soluta. Totam id dolores, sint aperiam sequi pariatur praesentium animi perspiciatis molestias iure, ducimus!</p>
              <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
              4.0 stars
            </div>
          </div>
          <!-- /.card -->

          <div class="card card-outline-secondary my-4">
            <div class="card-header">Comentarios</div>
            
            <div class="card-body">
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              
            </div>
          </div>
          <!-- /.card -->

        </div>
        <!-- /.col-lg-9 -->

      </div>

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/jquery/jquery.min.js"></script>
    <script src="https://blackrockdigital.github.io/startbootstrap-shop-item/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>

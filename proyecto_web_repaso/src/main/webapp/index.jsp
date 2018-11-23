<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!-- Custom css -->
<link rel="stylesheet" href="css/styles.css">

<base href="<%=request.getContextPath()%>/">

<title>Repaso - MVC</title>
</head>
<body>


	<header>
		<div class="container">
			<h1>Repaso - MVC</h1>
		</div>
	</header>

	<main role="main" class="container">




	<div class="card mt-4">
		<h5 class="card-header bg-primary text-white">Repaso Servlet o Controlador</h5>
		<div class="card-body">

			<p>Vamos a enviar datos por GET y POST</p>
			<p>El mapping del controlador es <b>/flujo-clasico</b> JSP -> Servlet -> JSP</p>
			<p><b>JSP -> SERVLET</b> enviamos <b>p�rametros</b>.</p>
			<p><b>SERVLET -> JSP</b> enviamos <b>atributos</b>.</p>

			<hr>

			<p>El servlet va a recibir dos par�metros <b>p1</b> y <b>p2</b>, los sumar� y lo enviar� como atributo <b>suma</b> a resultado.jsp.</p>
			<div class="container">
				<div class="row">
					<div class="col-6">
						<h2>Petici�n GET</h2>
						<p>En las peticiones GET se env�an los par�metros en la URL.</p>
						<pre><code>/flujo-clasico?op1=5&op2=13</code></pre>
						<a href="flujo-clasico?op1=5&op2=13" class="btn btn-primary">Sumar 5 + 13</a>
					</div>
					<div class="col-6">
						<h2>Petici�n POST</h2>
						<p>En las peticiones POST se env�an los par�metros a trav�s de un formulario.</p>

						<form action="flujo-clasico" method="post" id="formSuma">

							<div class="form-group">
								<label for="op1">Par�metro 1</label> 
								<input type="text" class="form-control" id="op1" name="op1" placeholder="Introduzca un n�mero" required>
							</div>
							<div class="form-group">
								<label for="op2">Par�metro 2</label> 
								<input type="text" class="form-control" id="op2" name="op2" placeholder="Introduzca un n�mero" required>
							</div>

							<button type="submit" class="btn btn-primary btn-block">Sumar</button>

						</form>

					</div>
				</div><!-- /.row -->
			</div><!-- /.container -->
		</div><!-- /.card-body -->
	</div><!-- /.card -->


	<div class="card mt-4">
		<h5 class="card-header bg-primary text-white">Crear un Videojuego</h5>
		<div class="card-body">
		
			<p class="text-danger">${msgError}</p>
			<form action="videojuego" method="post">
				
				<div class="form-group">
					<label for="titulo">T�tulo</label>
					<input type="text" id="titulo" name="titulo" class="form-control" placeholder="M�nimo 2 ym�ximo 150" />
				</div>
				
				<div class="form-group">
					<label for="fechaLanzamiento">Fecha de lanzamiento</label>
					<input type="date" id="fechaLanzamiento" name="fechaLanzamiento" class="form-control" />
				</div>
				
				<button type="submit" class="btn btn-primary btn-block">Crear</button>
			</form>
			
		</div>
	</div>
	
	<div class="card mt-4">
		<h5 class="card-header bg-primary text-white">Filtro de Seguridad</h5>
		<div class="card-body">
		
			<c:if test="${empty sessionScope.login}">
			
				<h3 class="text-danger">${msgLogin}</h3>
				<a href="videojuego" class="btn btn-outline-danger">Acceder privado</a>
			
			</c:if>
			
			<c:if test="${not empty sessionScope.login}">
			
				<h3 class="text-success">${msgLogin}</h3>
				<div class="row justify-content-between" id="botonesSesion">
						<a href="videojuego" class="btn btn-outline-success">Acceder privado</a>
						<a href="logout" class="btn btn-outline-secondary">Cerrar sesi�n</a>
				</div>
			</c:if>
			
			
		
			<form action="login" method="post">
				
				<div class="form-group">
					<label for="nombre">Nombre:</label>
					<input type="text" id="nombre" name="nombre" class="form-control" />
				</div>
				
				<div class="form-group">
					<label for="pass">Contrase�a</label>
					<input type="password" id="pass" name="pass" class="form-control" />
				</div>
				
				<button type="submit" class="btn btn-primary btn-block">Iniciar sesi�n</button>
			</form>
			
		</div>
	</div>

	</main>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>
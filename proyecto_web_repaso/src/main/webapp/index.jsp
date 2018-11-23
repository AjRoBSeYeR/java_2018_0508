<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="includes/header.jsp"%>

	<header class="shadow-sm p-3 mb-5 rounded">
	
		<div class="container">
			<h1 class="text-center">Hello, world!</h1>
		</div>

	</header>
	
	<main class="container">
	
		<%@include file="includes/alert.jsp"%>
		
		<div class="card">
			<div class="card-header bg-primary text-white">
				<span>Repaso Servlet o Controlador</span>
			</div>
			<div class="card-body">
				<h2>Repaso Servlet o Controlador</h2>
				<p>Vamos a enviar datos por GET y POST</p>
				<p>El mapping del controlador es <b>flujo-clasico:</b> JSP -> Servlet -> JSP</p>
				<p>JSP -> Servlet Se env�an <b>par�metros</b> || Servlet -> JSP <b>atributos</b></p>
			  	
			  	<hr>
			  	
			  	<p>El servlet va a recibir dos par�metros <b>p1</b> y <b>p2</b> los sumar� y lo 
			  	env�a como atributo <b>suma</b> a resultado.jsp</p>
			  	
			  	<hr>
	  	
				<div class="row">
					<div class="col-6 text-center">
						<h3>Petici�n GET</h3>
						<p>En las peticiones GET se env�an los par�metros en la URL.</p>
						<pre><code>/flujo-clasico?op1=5&op2=13</code></pre>
						
						<div>
							<a href="flujo-clasico?op1=5&op2=13" class="btn btn-block btn-outline-success">Petici�n Correcta</a>
							<a href="flujo-clasico?op2=13" class="btn btn-block btn-outline-danger">Petici�n sin un par�metro</a>
							<a href="flujo-clasico?op1=a&op2=13" class="btn btn-block btn-outline-warning mb-4">Petici�n con una letra</a>
						</div>
						
					</div>
					<div class="col-6 text-center">
						<h3>Petici�n POST</h3>
						<p>En las peticiones POST se env�an los par�metros a trav�s de un
						formulario.</p>
						<form action="flujo-clasico" method="post">
							<div class="form-row">
						    	<div class="col">
						      		<input autofocus required type="number" name="op1" step="1" class="form-control" placeholder="Primer valor">
						    	</div>
						    	<div class="col">
						      		<input required type="number" name="op2" step="1" class="form-control" placeholder="Segundo valor">
						    	</div>
							</div>
							<div class="form-row mt-3">
								<div class="col">
									<input type="submit" class="btn btn-block btn-outline-primary" value="Enviar">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		
		<hr>
		
		<div class="card mb-4 ">
			<div class="card-header bg-primary text-white">
				<span>Crear videojuego</span>
			</div>
			<div class="card-body">
			
				<%@include file="includes/alert.jsp"%>
				
				<form action="videojuego" method="post">
					<div class="form-group row">
					    <label for="titulo" class="col-sm-2 col-form-label">T�tulo</label>
					    <div class="col-sm-10">
					    	<input required type="text" class="form-control" name="titulo" placeholder="M�nimo 2 y m�ximo 150 caracteres" maxlength="150" minlength="2">
				    	</div>
					</div>
					<div class="form-group row">
				    	<label for="fecha_lanzamiento" class="col-sm-2 col-form-label">Fecha Lanzamiento</label>
				    	<div class="col-sm-10">
				      		<input required type="date" class="form-control" name="fecha_lanzamiento">
				    	</div>
					</div>
					<input type="submit" class="btn btn-outline-primary" value="Crear">
				</form>
			</div>
		</div>
	  	
	</main>
	
	<%@include file="includes/footer.jsp"%>
<%@include file="includes/header.jsp" %>

<%@include file="includes/navbar.jsp" %>

<main role="main" class="container">
	<div class="jumbotron">
		<h1>Ejemplos</h1>
		<p class="lead">Ejemplos con bootstrap 4 y Java Enterprise Edition</p>
		<div class="card-deck">
			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="images/imagen02.jpg" alt="Card image cap" width="180" height="180">
				<div class="card-body">
					<h5 class="card-title text-uppercase">Sistema Grid</h5>
					<p class="card-text">Sistema grid de bootstrap, con sus breakpoints y ejemplos de columnas.</p>
				</div>
				<div class="card-footer">
					<a href="grid.jsp" class="btn btn-outline-primary btn-lg btn-block">Ver Ejemplo</a>
				</div>
			</div>

			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="images/imagen03.png" alt="Card image cap" width="180" height="180">
				<div class="card-body">
					<h5 class="card-title text-uppercase">Componentes</h5>
					<p class="card-text">Ejemplos de los diferentes componentes de bootstrap 4.</p>
				</div>
				<div class="card-footer">
					<a href="componentes.jsp" class="btn btn-outline-secondary btn-lg btn-block">Ver Ejemplo</a>
				</div>
			</div>

			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="images/imagen04.jpg" alt="Card image cap" width="180" height="180">
				<div class="card-body">
					<h5 class="card-title text-uppercase">Arkanoid</h5>
					<p class="card-text">Juego arcanoid hecho con HTML y CSS.</p>

				</div>
				<div class="card-footer">
					<a href="arkanoid.jsp" class="btn btn-outline-primary btn-lg btn-block">Ver Ejemplo</a>
				</div>
			</div>

			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="images/imagen01.svg" alt="Card image cap" width="180" height="180">
				<div class="card-body">
					<h5 class="card-title text-uppercase">formulario</h5>
					<p class="card-text">Novedades de los formularios en HTML5.</p>

				</div>
				<div class="card-footer">
					<a href="formulario" class="btn btn-outline-secondary btn-lg btn-block">Ver Ejemplo</a>
				</div>
			</div>

		</div>
	</div>
	<!-- /cierre .container -->
</main>


<%@include file="includes/footer.jsp" %>
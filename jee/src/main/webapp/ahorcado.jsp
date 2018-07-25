<!doctype html>

<html lang="es">
	<head>
	<meta charset="utf-8">
		<title>Juego Ahorcado</title>
		<meta name="description" content="App web Java 3.0 para gestionar Prestamos de Libros">
		<meta name="author" content="Alain Mu�oz Arrizabalaga">
		
		<link rel="stylesheet" href="css/styles.css?v=1.2">
	</head>
	
	<body>
		<h1>Juego del Ahorcado</h1>
		
		<div class="ahorcado fallo${fallos}"></div><br>
		
		<span class="intentos">Intentos: ${intentos}</span>
		<span class="fallos">Fallos: ${fallos}</span>
		<span class="aciertos">Aciertos: ${aciertos}</span><br>
		
		<span class="palabraMostrar">${palabraMostrar}</span><br><br>
			                                                                                       
		<form action="juega" method="post">
				
			<input name="letra" type="text" placeholder="Dime Una Letra">
			<p class="text-danger">${msg}</p>
						
			<input type="submit" value="�Comprueba!" />
		
		</form>
		
		
		
		<a href="ahorcado?jdn=1">Jugar de Nuevo</a>
		
		<script src="js/scripts.js"></script>
	</body>
</html>
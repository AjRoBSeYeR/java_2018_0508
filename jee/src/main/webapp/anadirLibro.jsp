<!DOCTYPE HTML>
<html lang="es">
<head>
<meta charset="utf-8">

<title>A�adir libros</title>
<meta name="description"
	content="App web Java 3.0 para gestionar pr�stamos de libros">
<meta name="author" content="raul">

<link rel="stylesheet" href="css/styles.css?v=1.0">

</head>

<body>

	<h1>A�adir libro</h1>
	
	<div align="center">
		<form action="anadirLibro">
			<input name="titulo" type="text" placeholder="Titulo"> 
			<br> 
			<input name="editorial" type="text" placeholder="Editorial"> 
			<br> 
			<input name="isbn" type="text" placeholder="isbn"> 
			<br> 
			<input name="autor" type="text" placeholder="Autor"> 
			<br> 
			<label >Prestado?</label><input name="prestado" type="checkbox" placeholder="Prestado"> 
			<br> 
			<input type="submit" value="Dar de alta">
		</form>
	</div>
	
	

</body>
</html>
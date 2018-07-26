<!DOCTYPE HTML>
<html lang="es">
<head>
<meta charset="utf-8">

<title>Calculadora b�sica</title>

<meta name="author" content="Luis">
<link rel="stylesheet" href="css/styles.css?v=1.0">
<link rel="stylesheet" href="css/calculadorastyles.css?v=1.0">

</head>

<body>
	
	<%@ include file="includes/navbar.jsp"%>

	<h1>Bienvenido a la Calculadora</h1>

	<form action="calcular">
		<input name="num1" type="text" placeholder="Escribe aqu� un n�mero">
		<input name="num2" type="text"placeholder="Escribe aqu� un n�mero">
		<br/>
		<input type="radio" name="operacion" value="+"> + 
		<input type="radio" name="operacion" value="-"> - 
		<input type="radio" name="operacion" value="*"> * 
		<input type="radio" name="operacion" value="/"> /
		<br/> 
		<input type="submit" value="Enviar">
	</form>
	<span>${result}</span>
	<p> ${msg} </p>



</body>
</html>
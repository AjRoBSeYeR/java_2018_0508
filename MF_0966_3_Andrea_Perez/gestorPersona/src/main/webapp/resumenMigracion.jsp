<%@include file="includes/header.jsp"%>
<%@include file="includes/navbar.jsp"%>
<div class="container">
		
	<h1 class="mt-4 text-center">Resultados de la migraci�n de datos </h1>
	
	<p>Total de registros le�dos: <b class="text-info">${leidos}</b></p>
	<p>Total de registros insertados: <b class="text-success">${correctos}</b></p>
	<p>Total de registros err�neos: <b class="text-danger">${errores}</b></p>

</div>



















<%@include file="includes/footer.jsp"%>
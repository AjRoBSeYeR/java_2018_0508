<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="includes/header.jsp"%>

<%@include file="includes/navbar.jsp"%>

<main class="container">
		
	<h1 class="mt-4">Resultados de la migraci�n del fichero con personas: </h1>
	
	<p>Registros le�dos: <b class="text-info">${leidos}</b></p>
	<p>Registros insertados: <b class="text-success">${correctos}</b></p>
	<p>Registros err�neos: <b class="text-danger">${errores}</b></p>
	

</main>

<%@include file="includes/footer.jsp"%>
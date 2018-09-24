<!-- Cabecera -->
<%@ include file="vendor/include/header.jsp" %>

<!-- Cabecera -->
<%@ include file="vendor/include/navbar.jsp" %>

<main class="container" role="main">
	
	<div class="row align-center">
        <div class="col color-primary">
			<!-- Gesti�n de alertas -->
			<%@include file="vendor/include/alert.jsp" %>
		</div>
	</div>
	
	<div class="row align-center">
        <div class="col color-primary">
			<!-- Formulario de Acceso -->
			<%@ include file="vendor/include/modal-login-form.jsp" %>
		</div>
	</div>
	
	<div class="row align-center">
        <div class="col-md-12 color-primary">
            <div class="error-template">
                <h1>404 No Encontrado</h1>
                <h2>Ooops!</h2>
                
                <div class="error-details">
                   <p>Lo sentimos, ha ocurrido un error inesperado. 
                   La p�gina ${requestScope["javax.servlet.forward.request_uri"]} no est� disponible.</p>
                </div>
                
                <div class="error-actions">
                    <a href="index.jsp" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-home"></span>Inicio </a>
                    <a href="mailto:example@email.com" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-envelope"></span> Cont�ctanos </a>
                </div>
            </div>
        </div>
    </div>
</main>

<!-- Pie de P�gina -->
<div class="row align-center fixed-bottom">
	<div class="col-md-12 color-primary">
		<%@ include file="vendor/include/footer.jsp" %>
	</div>
</div>
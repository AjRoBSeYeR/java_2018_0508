<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

	 <div class="container">
	 	<%@include file="includes/alerts.jsp" %>
        <section class="row justify-content-center mt-2">
        	<h2 class="text-center col-12 text-info">�Registrate!</h2>
            <form action="registrarse" method="post" class="col-6 shadow p-3 mb-5 bg-white rounded">
            	<div class="form-group">
                	<label for="usuario">Usuario:</label>
                    <input name="usuario" type="text" class="form-control" id="usuario" placeholder="Nombre (max. 50 car)" required autofocus>
                </div>
                <div class="form-group">
                    <label for="contrase�a">Contrase�a:</label>
                    <input name="password" type="password" class="form-control" id="contrase�a" placeholder="Contrase�a (max. 20 car)" required>
                </div>
                <div class="form-group">
                    <label for="contrase�a2">Vuelve a introducir la contrase�a:</label>
                    <input name="password" type="password" class="form-control" id="contrase�a2" placeholder="Contrase�a (max. 20 car)" required>
                </div>
                <button type="submit" class="btn btn-outline-primary btn-block">Registrarse</button>
            </form>
     	</section>
     </div>

<%@include file="includes/footer.jsp" %>
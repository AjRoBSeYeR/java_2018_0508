<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>
<main role="main" class="container">
		<h1>Registro de nuevo usuario</h1>
		
		
		<form action="formulario" method="post">
		
			<div class="row justify-content-center">
			
				<div class="col-md-6">
				
				 	<div class="form-group">
				 		<label for="nombre" class="required obligatorio">Nombre:</label>
						<input type="text" name="nombre" autofocus class="form-control" minlength="4" maxlength="15"required placeholder="Nombre" tabindex="1">				
						
					</div>
				
				
				<div class=" form-row">
						<div class="form-group col">
								<label for="pass" class="obligatorio">Contraseña:</label>			
								<input type="password" name="pass" class="form-control" minlength="8" maxlength="20"required placeholder="Introduce la contraseña" tabindex="2">
							
						</div>
						<div class="form-group col">
								<label for="pass2" class="obligatorio"> Repite la contraseña:</label>			
								<input type="password" name="pass2" class="form-control" required placeholder="Introduce de nuevo tu contraseña"tabindex="3">
							
							
						</div>
				</div>		
				
				<div class="form-group">
						<label for="email" class="obligatorio">E-mail</label>			
						<input type="email" name="email" class="form-control" required placeholder="Introduce tu E-mail">
						
						<button type="submit" class="btn btn-outline-primary btn-lg btn-block">Registrar</button>
				</div>
			</div>		
			</div><!-- /row -->
			
		</form>
		
		
	</main>


<%@include file="includes/footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>
<!--  -->
<%@page import="com.ipartek.formacion.nidea.pojo.*"%>

	<main role="main" class="container">
		<h1>Formulario Alta Producto</h1>
		<form action="formulario" method="post" novalidate>	
		
			<div class="form-group">
				
				<span class="invalid">*</span><label for="nombre">Nombre</label>
				<input type="text" class="form-control" autofocus name="nombre" required placeholder="Nombre del Producto" tabindex="1"></p>
			</div>
			
			<div class="form-row">
			
			
				<div class="form-group">
					
						<span class="invalid">*</span><label for="codigo">Codigo</label>
						<input type="text" class="form-control" name="codigo" required placeholder="Código del Producto" tabindex="3">
				</div>
				<div class="form-group">
					
						<span class="invalid">*</span><label for="precio">Precio</label>
						<input type="number" class="form-control" name="precio" required placeholder="Precio del Producto" tabindex="4">
					
				</div>
				<div class="form-group">
					
						<label for="oferta">Oferta: </label>
						<input type="checkbox" class="form-control" name="oferta" tabindex="2">
					
				</div>
				<!-- <div class="form-group">
				<label for="descripcion">Descripcion: </label>
				<textarea type=text name="descripcion" required placeholder="Descripcion" tabindex="5">
				
			</div> -->
			</div>	
			
			
					
			<div>
	        	<input type="submit" value="Enviar" id="enviar"/>
	        </div>	
					
			
		</form></p>
		
		
		
		
		
		
		
	
		
	</main>


<%@include file="includes/footer.jsp" %>
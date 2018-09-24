<%@include file="includes/taglibs.jsp"%>

<%@page import="com.ipartek.formacion.supermercado.model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Página principal</title>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles.css">

</head>
<body>

    <div class="contenedor">

        <%@include file="includes/navbar.jsp"%>
        
        <h2>Número de Productos ${numeroProductos}</h2>

        <div class="contenido">
        
        <c:forEach items="${productos}" var="p">
        		
        	<div class="producto">

        		<c:if test="${p.descuento != 0 }">
        		
        			<p class="descuento">${p.descuento}&#37;</p>
        		
        		</c:if>

                <img src="${p.imagen}" alt="imagen-producto" />
    
                <div class="texto-producto">
				    <c:if test="${p.descuento == 0 }">
				        		
				    	<p class="no-descuento">${p.precio}&euro;</p>
				        		
	        		</c:if>
	        		
        			<c:if test="${p.descuento != 0 }">
        			
                    	<p><span class="tachado">${p.precio}&euro;</span><span>${p.calcularDescuento}&euro;</span></p>
                    	
                    </c:if>
                    <p class="precio-litro">(${p.precioVolumen}&euro; / Litro)</p>
                    <p>${p.descripcion}</p>
    
                    <div class="cantidad">
                            <span>&#45;</span> 1 <span>&#43;</span>
                    </div>
    
                </div>
    
                <a href="#">AÑADIR AL CARRO</a>

            </div> <!-- /.producto -->
        
        </c:forEach>
            
        </div> <!-- /.contenido -->

        <a href="#top" class="top">Top</a>

        <footer>

            <div>
                <p>&copy; 2018</p>
            </div>

            <nav>
                <a href="#">Politica de privacidad</a>
                <a href="#">Contacto</a>
                <a href="#">Localización</a>
            </nav>

            <div class="social">
                <a href="https://es-es.facebook.com/" id="facebook" target="_blank"><i class="fab fa-facebook-square fa-3x"></i></a>
                <a href="https://twitter.com/?lang=es" id="twitter" target="_blank"><i class="fab fa-twitter-square fa-3x"></i></a>
            </div>

        </footer>


    </div> <!-- /.contenedor -->

    
</body>
</html>
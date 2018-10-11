
<div class="card card-outline-secondary my-4">
   <div class="card-header">
     Comentarios
   </div>
   <div class="card-body">
   
   	 <div class="form-comentario">
 
   	 	<p><b class="text-warning">${usuario.nombre}</b> Queremos saber que op�nas de este video</p>
   	 	<c:if test="${empty usuario}">
   	 	<p><i class="text-danger">*Para poder escribir tu opini�n, por favor incia sessi�n.</i></p>
   		</c:if>
   	  	<form action="publicar" method="post" class="form-inline d-flex align-items-stretch ">
   	 		<textarea class="form-control" name="texto" rows="5" placeholder="Danos tu opini�n..." ${(usuario==null)?'id=disabledInput disabled':'required'} ></textarea>
   	 		<input type="hidden" name="id_video" value="${videoInicio.id}">
   	 		<input type="submit" value="Comentar" class="form-control ml-auto btn btn-outline-info" ${(usuario==null)?'id=disabledInput disabled':''} >
   	 	</form>
   	 </div>
   	 		
   	 <hr>
   	 
   	 <c:forEach items="${comentarios}" var="c">
     	<p>${c.texto}</p>
     	<small class="text-muted"><b>${c.usuario.nombre}</b>  <fmt:formatDate value="${c.fecha}" pattern="dd/MM/yyyy HH:mm"/></small>
     	<hr>
     </c:forEach>
          
   </div>
 </div>
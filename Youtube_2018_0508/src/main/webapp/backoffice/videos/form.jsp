<!-- Formulario de Usuarios -->

<%@page import="com.ipartek.formacion.pojo.Usuario"%>
<%@include file="../includes/taglibs.jsp"%>

<%@include file="../includes/header.jsp"%>

<!-- Listado de Usuarios -->

 <div id="wrapper">

		<%@include file="../includes/aside.jsp"%>

        <div id="page-wrapper">
        
        	<%@include file="../includes/alerts.jsp"%>
        	
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">${(video.id==-1)?'Crear V�deo':video.nombre}</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Formulario de gesti�n de v�deos
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <form action="" method="post">
                            
                            	<div class="form-row">
                            		<div class="col">
										<div class="form-group col-md-6">
										   <label for="id">ID del v�deo: </label>
										   <input readonly="readonly" class="form-control" type="text" name="id" id="id" value="${(usuario.id==-1)?'':usuario.id}">
									   </div>
									</div>
									<div class="col">
										<div class="form-group col-md-6">
										   <label class="required" for="nombre">Nombre del v�deo: </label>
										   <input class="form-control" type="text" name="nombre" id="nombre" placeholder="M�nimo 3 caracteres y m�ximo 10" minlength="3" maxlength="10" autofocus tabindex="1" required
										   value="${(video.id==-1)?'':video.nombre}">
									   </div>
									</div>
								</div>
								
								<div class="form-row">
                            		<div class="col">
										<div class="form-group col-md-6">
										   <label for="codigo">C�digo del v�deo: </label>
										   <input class="form-control" type="text" name="codigo" id="codigo" placeholder="Deben ser 11 caracteres exactos" minlength="11" maxlength="11" tabindex="2" required
										   value="${(video.id==-1)?'':video.codigo}">
									   </div>
									</div>
								</div>
								
								<div class="form-row">
									<div class="form-group">
									   <input class="form-control" type="hidden" name="op" id="op" value="${(video.id==-1)?'0':'1'}">
								   </div>
								</div>
                            	
                            	<input type="submit" value="${(video.id==-1)?'Crear':'Modificar'}" class="form-control btn btn-primary btn-block" />
                            	<c:if test="${video.id >0 }">
                            		<a href="usuarios?id=${video.id}&op=2" onclick="confirmar(event)" class="btn btn-danger btn-block">Eliminar(Modal)</a>
                            	</c:if>
                            </form>
                            
                            <script>
                            	function confirmar(e){
                            		if(confirm('�Est�s seguro de que quieres eliminar?')){
                            			console.log('Pulsado eliminar');
                            		}else{
                            			//Prevenir el evento por defecto del enlace
                            			e.preventDefault();
                            		}
                            	}
                            </script>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->

<%@include file="../includes/footer.jsp"%>
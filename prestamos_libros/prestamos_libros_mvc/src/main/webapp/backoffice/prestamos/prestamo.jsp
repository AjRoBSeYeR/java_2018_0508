<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.ipartek.formacion.prestamolibros.controller.CrudControllable"%>
<%@page import="com.ipartek.formacion.prestamolibros.pojo.Prestamo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>

<div id="page-wrapper">
	<%@include file="../includes/alert.jsp"%>

	<div class="row divTitulo">
        <div class="col-md-8">
            <h1 class="page-header titulo">Libros prestados <span class="badge">${fn:length(prestamos)}</span></h1>
        </div>
            
    
		<div class="col-md-4 btn-crear">
  			<a href="prestamos?id=-1&op=<%=CrudControllable.OP_IR_FORMULARIO%>" class="btn btn-primary">Prestar libro</a>  			
  		</div>
	</div>

	<table id="tablaOrdenable" class="display">
		<thead>
			<tr>
				<th>Libro</th>
				<th>Alumno</th>
				<th>Fecha de inicio</th>
				<th>Fecha final</th>
				<th>Días restantes</th>
				<th>Modificar préstamo</th>
				<th>Finalizar préstamo</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${prestamos}" var="p">

				<tr>
					<td><a href="biblioteca?id=${p.libro.id}&op=<%=CrudControllable.OP_IR_FORMULARIO %>" >${p.libro.titulo}</a></td>
					<td><a href="alumnos?id=${p.alumno.id}&op=<%=CrudControllable.OP_IR_FORMULARIO %>">${p.alumno.nombre} ${p.alumno.apellidos}</a></td>
					<td>${p.fechaInicio}</td>
					<td>${p.fechaFin}</td>
					<td class="${(p.diasRestantes < 0)? 'rojo' : 'gris'}">${p.diasRestantes}</td>
					<td><a href="prestamos?libro=${p.libro.id}&alumno=${p.alumno.id}&fechaInicio=${p.fechaInicio}&fechaFin=${p.fechaFin}&op=6" class="btn btnModificar">Modificar préstamo</a></td>
					<td><span onclick="showModalDevolucion(${p.libro.id}, ${p.alumno.id}, '${p.libro.titulo}', '${p.alumno.nombre}', '${p.fechaInicio}')" class="btn btnFinalizar">Finalizar préstamo</span></td>
				</tr>

			</c:forEach>

		</tbody>
		<tfoot>
			<tr>
				<th>Libro</th>
				<th>Alumno</th>
				<th>Fecha de inicio</th>
				<th>Fecha final</th>
				<th>Días restantes</th>
				<th>Modificar préstamo</th>
				<th>Finalizar préstamo</th>
			</tr>
		</tfoot>
	</table>
	
	<!-- Modal devolución -->
			<div class="modal fade" id="modalDevolucion" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h4 class="modal-title" id="exampleModalLabel">Finalizar préstamo</h4>
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          <span aria-hidden="true">&times;</span>
			        </button>
			      </div>
			      <div class="modal-body">
			      	<form action="prestamos" method="post">
			      	
			      		<div class="form-group">
				      		<label for="titulo">Libro</label>
				        	<input type="text" class="form-control" id="titulo" readonly />
			        	</div><div class="form-group">
				      		<label for="nombre">Alumno</label>
				        	<input type="text" class="form-control"id="nombre" readonly />
			        	</div>
			      	
				      	<div class="form-group">
				      		<label for="fechaDevuelto">Fecha de devolución</label>
				        	<input type="date" class="form-control" name="fechaDevuelto" id="fechaDevuelto" required value="${fechaInicio}"/>
			        	</div>
			        	
			        	<input type="hidden" name="libro" id="libro" />
			        	<input type="hidden" name="alumno" id="alumno" />
			        	<input type="hidden" name="fechaInicio" id="fechaInicio" />
			        	<input type="hidden" name="op" value=<%=CrudControllable.OP_ELIMINAR %> />
			        	<input type="submit" class="btn btn-finalizar btn-block" value="Finalizar préstamo" />
			        	
			        </form>
			      </div>
			    </div>
			  </div>
			</div>


</div>
<%@include file="../includes/footer.jsp"%>
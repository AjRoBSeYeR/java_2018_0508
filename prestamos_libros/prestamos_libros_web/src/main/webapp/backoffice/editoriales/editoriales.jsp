<%@ include file="../includes/header.jsp"  %>
  <div id="app">
    <div class="main-wrapper">
      <div class="navbar-bg"></div>

     <%@ include file="../includes/nav.jsp"  %>

      <div class="main-content">
        <section class="section">
          <h1 class="section-header">
            <div>Editoriales</div>
          </h1>
          <div class="section-body">
            <div class="row">
              <div class="col-12">
                <div class="card">
                  <div class="card-header">
                    
                    <%@ include file="../includes/alert.jsp"  %>
                    
                    <h4>Listado de Editoriales</h4>
                  </div>
                  <div class="card-body">
                      <a href="editorial?op=4" class="btn btn-sm btn-info mb-3">A�adir nuevo Editorial</a>
                    
                    <!--  datatables -->
		      		<table id="tablaOrdenable" class="display" style="width:100%">
				        <thead>
				            <tr>
				            	<th>ID</th>
				                <th>Nombre</th>
	                          	<th>Acciones</th>		                
				            </tr>
				        </thead>
				        <tbody>
                  			<c:forEach items="${editoriales}" var="e">
		                        <tr>
		               			  <td>${e.id}</td>
		                          <td>${e.nombre}</td>
		                          <td>
		                              <a class="btn btn-primary btn-action mr-1" data-toggle="tooltip" title="Edit" href="editorial?op=4&id=${e.id}"><i class="ion ion-edit"></i></a>
		                              <a onclick="confirmar(event)" class="btn btn-danger btn-action" data-toggle="tooltip" title="Delete" href="editorial?op=3&id=${e.id}"><i class="ion ion-trash-b"></i></a>
		                            </td>
		                        </tr>
	                        </c:forEach>
                        </tbody>
				    </table>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
      
      <script>
      		function confirmar( e ) {					
      			if ( confirm('�Estas seguro que quieres ELIMINAR ?') ){
      				console.log('confirmado eliminar');
      			}else{
      				//prevenir el evento por defecto de <a href=''>
      				e.preventDefault();
      			}      				
			}
      </script>
      
      <%@ include file="../includes/footer.jsp"  %>
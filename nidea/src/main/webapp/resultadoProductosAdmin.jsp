
<%@page import="com.ipartek.formacion.nidea.pojo.Producto"%>
<%@page import="java.text.DecimalFormat" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat" %>
<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tablas</title>
    <script>
            //Esperamos a que todo el HTML este cargado == body onload
            $(document).ready(function() { 
                // $('#example')  => selecciona un objeto por id="example"
                // .DataTable();  => ejecutar el plugin de dataTable
                $('#example').DataTable({
                    "language": {
                        "url": "vendors/datatables/i18n/spanish/Spanish.json"
                    }
                });
            } );
        </script>
    

</head>
<body>

     <h1>Vista admin : productos</h1>
     <a href="https://datatables.net" target="_blank">Documentacion oficial DataTables</a>
		<%
			ArrayList<Producto> productos = (ArrayList<Producto>) request.getAttribute("productos");
			DecimalFormat df = new DecimalFormat("#0.00€");
		%>
		<table id="example" class="display responsive nowrap" width="100%">
			<thead>
                    <tr>
                    	<th>Id</th>
                        <th>Nombre</th>
                        <th>Codigo</th>
                        <th>Descripcion</th>
                        <th>Oferta</th>
                        <th>Precio</th>
                       
                    </tr>
                </thead>
                <tbody>
                <%
                	for( Producto p : productos){
                		
                	
                %>
                    <tr>
                    	<td><%=p.getId()%></td>
                        <td><%=p.getNombre()%></td>
                        <td><%=p.getCodigo()%></td>
                        <td><%=p.getDescripcion()%></td>
                        <td><%=p.isOferta()%></td>
                        <td><%=df.format(p.getPrecio())%></td>
                        
                    </tr>
				<%
					}
				%>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Codigo</th>
                        <th>Descripcion</th>
                        <th>Oferta</th>
                        <th>Precio</th>
                    </tr>
                </tfoot>
       		</table> 
    
</body>
</html>


<%@include file="includes/footer.jsp" %>
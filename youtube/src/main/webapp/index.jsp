<%

	/*
		Redireccionamos al HomeController para poder cargar la informaci�n
		necesaria en la vista home.jsp.
	*/
	
	response.sendRedirect(request.getContextPath() + "/inicio");


	/*
		Tambi�n podemos usar el fichero 'web.xml' para decir cual es la URL inicial	.
	*/

%>
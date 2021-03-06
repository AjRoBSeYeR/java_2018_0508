package com.ipartek.formacion.prestamolibros.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ipartek.formacion.prestamolibros.controller.pojo.Alert;
import com.ipartek.formacion.prestamolibros.pojo.Usuario;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final static Logger LOG = Logger.getLogger(LoginController.class);
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Alert alert = new Alert();
		HttpSession session = request.getSession();
		String view = "/login.jsp";
		
		try {
			
			String nombre = request.getParameter("nombre");
			String pass = request.getParameter("pass");
		
			Usuario u = new Usuario(nombre, pass);
			
			if(Usuario.NOMBRE_ADMIN.equals(u.getNombre()) && Usuario.PASS_ADMIN.equals(u.getPassword())) {
				
				//guardar Usuario en session
				session.setAttribute("usuario", u);
				session.setMaxInactiveInterval(60*60*24); // 1 día
				
				alert = new Alert(Alert.SUCCESS, "Bienvenido " + u.getNombre());
				view = "/backoffice/prestamos";
				
			}else {
				alert.setTexto("Credenciales incorrectas");
			}
		
		} catch (Exception e) {
			LOG.debug(e);
			alert = new Alert();
		
		}finally {
			session.setAttribute("alert", alert);
			response.sendRedirect(request.getContextPath() + view);
		}
		
		
		
	}

}

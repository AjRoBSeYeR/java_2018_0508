package com.ipartek.formacion.supermercado.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.supermercado.model.Producto;
import com.ipartek.formacion.supermercado.model.ProductoArrayListDAO;

/**
 * Servlet implementation class ListadoController
 */
@WebServlet(description = "Servlet que controla el acceso al listado de productos del panel de control.", urlPatterns = { "/listado" })
public class ListadoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	ProductoArrayListDAO dao;
	ArrayList<Producto> productos;

	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		dao = ProductoArrayListDAO.getInstance();
	}

	public void destroy() {
		
		dao = null;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProccess(request, response);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProccess(request, response);
	}

	private void doProccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			cargarProductos();
			
			request.setAttribute("productos", productos);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			request.getRequestDispatcher("privado/listado.jsp").forward(request, response);
		}

	}

	private void cargarProductos() {
		
		// Listado de Productos
		productos = (ArrayList<Producto>) dao.getAll();
	}
}
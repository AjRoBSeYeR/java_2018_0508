package com.ipartek.formacion.prestamolibros.service;

import java.sql.Date;
import java.util.List;

import com.ipartek.formacion.prestamolibros.model.PrestamoDAO;
import com.ipartek.formacion.prestamolibros.pojo.Alumno;
import com.ipartek.formacion.prestamolibros.pojo.Libro;
import com.ipartek.formacion.prestamolibros.pojo.Prestamo;

public class ServicioPrestamo implements IServicePrestamo{
	
private static ServicioPrestamo INSTANCE = null;
	
	private PrestamoDAO daoPrestamo;
	
	private ServicioPrestamo() {
		super();
		daoPrestamo = PrestamoDAO.getInstance();
	}

	public static synchronized ServicioPrestamo getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ServicioPrestamo();
		}
		return INSTANCE;
	}

	@Override
	public boolean prestar(long idLibro, long idAlumno, Date fechaInicio) throws Exception {
		
		return daoPrestamo.prestar(idLibro, idAlumno, fechaInicio);
	}

	@Override
	public boolean devolver(long idLibro, long idAlumno, Date fechaInicio, Date fechaDevolucion) throws Exception {
		
		return daoPrestamo.devolver(idLibro, idAlumno, fechaInicio, fechaDevolucion);
	}

	@Override
	public List<Prestamo> prestados() throws Exception {
		
		return daoPrestamo.getPrestados();
	}
	
	@Override
	public List<Prestamo> historico() throws Exception{
		return null;
	}

	@Override
	public List<Libro> librosDisponibles() throws Exception {
		return daoPrestamo.getLibrosDisponibles();
	}

	@Override
	public List<Alumno> alumnosDisponibles() throws Exception {
		return daoPrestamo.getAlumnosDisponibles();
	}

}

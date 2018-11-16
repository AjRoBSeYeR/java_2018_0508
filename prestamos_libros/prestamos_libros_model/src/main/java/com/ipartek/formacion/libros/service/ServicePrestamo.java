package com.ipartek.formacion.libros.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.libros.model.AlumnoDAO;
import com.ipartek.formacion.libros.model.EditorialDAO;
import com.ipartek.formacion.libros.model.LibroDAO;
import com.ipartek.formacion.libros.model.PrestamoDAO;
import com.ipartek.formacion.libros.pojo.Alumno;
import com.ipartek.formacion.libros.pojo.Libro;
import com.ipartek.formacion.libros.pojo.Prestamo;

public class ServicePrestamo implements IPrestamoService {

	private static ServicePrestamo INSTANCE = null;

	private static PrestamoDAO prestamosDAO;
	private static LibroDAO librosDAO;
	private static AlumnoDAO alumnosDAO;
	private static EditorialDAO editorialDAO;

	private ServicePrestamo() {
		super();
		prestamosDAO = PrestamoDAO.getInstance();
		librosDAO = LibroDAO.getInstance();
		alumnosDAO = AlumnoDAO.getInstance();
		editorialDAO = EditorialDAO.getInstance();
	}

	public static synchronized ServicePrestamo getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new ServicePrestamo();
		}

		return INSTANCE;
	}

	@Override
	public boolean devolver(long idAlumno, long idlibro, Date fechaInicio, Date fechaRetorno) throws Exception {
		boolean resul = false;

		Alumno alumno = new Alumno();
		alumno.setId(idAlumno);

		Libro libro = new Libro();
		libro.setId(idlibro);

		Prestamo prestamo = new Prestamo();

		prestamo.setAlumno(alumno);
		prestamo.setLibro(libro);
		prestamo.setFechaInicio(fechaInicio);
		prestamo.setFechaRetorno(fechaRetorno);

		resul = prestamosDAO.delete(prestamo);

		return resul;
	}

	@Override
	public boolean prestar(long idAlumno, long idlibro, Date fechaInicio) throws Exception {
		boolean resul = false;

		ArrayList<Alumno> alumnosDisponibles = new ArrayList<Alumno>();
		ArrayList<Libro> librosDisponibles = new ArrayList<Libro>();
		ArrayList<Prestamo> prestamosTotales = new ArrayList<Prestamo>();

		try {
			if (idAlumno < 0 || idlibro < 0 || fechaInicio == null) {

				throw new Exception("Algun parametro no contiene el formato esperado");
			}

		} catch (Exception e) {

		}

		// comprobamos que los alumno y libro que nos solicitan existen
		Alumno a = alumnosDAO.getById(idAlumno);

		if (a == null) {
			throw new Exception("Alumno no disponible");
		}

		Libro l = librosDAO.getById(idlibro);
		if (l == null) {
			throw new Exception("Libro no disponible");
		}

		// si existen comprobamos que esten disponibles

		alumnosDisponibles = (ArrayList<Alumno>) alumnosDAO.getAllDisponible();
		if (!alumnosDisponibles.contains(a)) {

			throw new Exception("El alumno contiene algun prestamo pendiente");

		}

		librosDisponibles = (ArrayList<Libro>) librosDAO.getAllDisponibles();
		if (!librosDisponibles.contains(l)) {

			throw new Exception("El libro no esta disponible");

		}

		// comprobamos que el prestamo no exista ya
		prestamosTotales = (ArrayList<Prestamo>) prestamosDAO.getAll();

		Prestamo prestamo = new Prestamo();

		prestamo.setAlumno(a);
		prestamo.setLibro(l);
		prestamo.setFechaInicio(fechaInicio);

		for (Prestamo p : prestamosTotales) {
			if (p.getAlumno().getId() == idAlumno && p.getLibro().getId() == idlibro
					&& p.getFechaInicio() == fechaInicio) {
				throw new Exception("El prestamo que esta dando de alta ya existe");
			}
		}

		// Si llega hasta aqui es porque ha superado todas las validaciones
		resul = prestamosDAO.insert(prestamo);

		return resul;
	}

	public Prestamo obtenerPorId(long alumno, long libro, Date fecha) throws Exception {

		return prestamosDAO.getById(alumno, libro, fecha);
	}

	public boolean modificarActivo(long idAlumno, long idlibro, Date fechaInicio) throws Exception {
		boolean resul = false;

		resul = prestamosDAO.update(crearPrestamo(idAlumno, idlibro, fechaInicio, null, null));

		return resul;
	}

	public Prestamo modificar(long idAlumno, long idLibro, Date fechaInicio, long nuevoAlumno, long nuevoLibro,
			Date nuevaFecha, Date fechaFin, Date fechaRetorno) throws Exception {
		boolean resul = false;

		// comprobamos que exista el registro a modificar
		Prestamo prestamoActual = new Prestamo();
		java.sql.Date fechaInicioSql = new java.sql.Date(fechaInicio.getTime());
		prestamoActual = obtenerPorId(idAlumno, idLibro, fechaInicioSql);
		Prestamo prestamoActualizado = new Prestamo();
		if (prestamoActual == null) {

			throw new Exception("No encontramos el prestamos que nos propones");
		}
		
		//comprobamos que los nuevos datos que corresponden a la actualizacion son coherentes(LIBRO Y ALUMNno QUE EXISTAN Y ESTEN LIBRES)
		
		Libro l = librosDAO.getById(idLibro);
		Alumno a = alumnosDAO.getById(idAlumno);

		// comprobamos los datos a modificar
		if (nuevoAlumno <= 0) {
			nuevoAlumno = idAlumno;

		}
		if (nuevoLibro <= 0) {
			nuevoLibro = idLibro;

		}

		if (nuevaFecha == null) {
			nuevaFecha = fechaInicio;
		}

		resul = prestamosDAO.update(idAlumno, idLibro, fechaInicio, nuevoAlumno, nuevoLibro, nuevaFecha, fechaFin,
				fechaRetorno);
		if (resul) {
			prestamoActualizado = prestamosDAO.getById(nuevoAlumno, nuevoLibro, nuevaFecha);
		}

		return prestamoActualizado;
	}

	@Override
	public List<Libro> librosDisponibles() throws Exception {

		return librosDAO.getAllDisponibles();
	}

	public List<Libro> listarLibros() throws Exception {

		return librosDAO.getAll();
	}

	@Override
	public List<Alumno> alumnosDisponibles() throws Exception {

		return alumnosDAO.getAllDisponible();
	}

	public List<Alumno> listarAlumnos() throws Exception {

		return alumnosDAO.getAll();
	}

	@Override
	public List<Prestamo> prestamosActivos() throws Exception {

		return prestamosDAO.getAllActivos();
	}

	public List<Prestamo> todosPrestamos() throws Exception {
		return prestamosDAO.getAll();
	}

	/*
	 * public boolean modificarPrestamoActivo(long idAlumno, long idlibro, Date
	 * fechaInicio, long nuevoAlumno, long nuevoLibro, Date nuevaFecha, Date
	 * fechaFin) throws Exception { boolean resul;
	 * 
	 * resul = prestamosDAO.update(idAlumno, idlibro, fechaInicio, nuevoAlumno,
	 * nuevoLibro, nuevaFecha, fechaFin, null);
	 * 
	 * return resul; }
	 */

	@Override
	public List<Prestamo> historico() throws Exception {

		return prestamosDAO.getAllHistorico();
	}

	/*
	 * public boolean modificarHistorico(long idAlumno, long idlibro, Date
	 * fechaInicio, long nuevoAlumno, long nuevoLibro, Date nuevaFecha, Date
	 * fechaFin, Date fechaRetorno) throws Exception { boolean resul;
	 * 
	 * resul = prestamosDAO.update(idAlumno, idlibro, fechaInicio, nuevoAlumno,
	 * nuevoLibro, nuevaFecha, fechaFin, fechaRetorno);
	 * 
	 * return resul; }
	 */

	private Prestamo crearPrestamo(long idAlumno, long idlibro, Date fechaInicio, Date fechaFin, Date fechaRetorno) {

		Alumno alumno = new Alumno();
		alumno.setId(idAlumno);

		Libro libro = new Libro();
		libro.setId(idlibro);

		Prestamo prestamo = new Prestamo();
		prestamo.setAlumno(alumno);
		prestamo.setLibro(libro);
		prestamo.setFechaInicio(fechaInicio);
		prestamo.setFechaFin(fechaFin);
		prestamo.setFechaRetorno(fechaRetorno);

		return prestamo;

	}

	@Override
	public boolean modificar(long idAlumno, long idlibro, Date fechaInicio, Date fechaFin) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
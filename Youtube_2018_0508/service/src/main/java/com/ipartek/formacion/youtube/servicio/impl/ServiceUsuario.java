package com.ipartek.formacion.youtube.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.log4j.Logger;
import com.ipartek.formacion.youtube.model.UsuarioDAO;
import com.ipartek.formacion.youtube.pojo.Rol;
import com.ipartek.formacion.youtube.pojo.Usuario;
import com.ipartek.formacion.youtube.service.IServiceUsuario;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class ServiceUsuario implements IServiceUsuario {
	
	private static ServiceUsuario INSTANCE = null;
	
	private UsuarioDAO daoUsuario = null;
	
	//Validaciones
	ValidatorFactory factory = null;
	Validator validator = null;
	
	// Logger
	private final static Logger LOG = Logger.getLogger(ServiceUsuario.class);
	
	private ServiceUsuario() {
		super();
		daoUsuario = UsuarioDAO.getInstance();
		
		// Crear Factoria y Validador
		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	public static synchronized ServiceUsuario getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ServiceUsuario();
		}

		return INSTANCE;
	}

	@Override
	public Usuario login(String nombre, String pswd) {
		Usuario u = null;
		try {
			u = daoUsuario.getByNombreAndPswd(nombre, pswd);
			LOG.debug("Credenciales correctas " + u);
		} catch (Exception e) {
			LOG.error(e);
		}
		return u;
	}

	@Override
	public Usuario buscarPorId(long id) {
		
		Usuario u = null;
		try {
			u = daoUsuario.getById(Long.toString(id));
		} catch (Exception e) {
			LOG.error(e);
		}
		return u;
	}

	@Override
	public List<Usuario> listar() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			usuarios = (ArrayList<Usuario>) daoUsuario.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public boolean crear(Usuario u) throws Exception{
		boolean resul = false;
		
		try {
			Rol rol = new Rol();
			rol.setId(Rol.ROL_USER);
			u.setRol(rol);
			
			Set<ConstraintViolation<Usuario>> violations = validator.validate(u);
			if (violations.isEmpty()) {
				if(daoUsuario.insert(u)) {
					LOG.debug("Usuario creado");
					resul = true;
				}
			}else {
				for (ConstraintViolation<Usuario> violation : violations) {
					LOG.debug("Error de validacion al crear usuario: " + violation.getPropertyPath() + ": "
							+ violation.getMessage());
				}
				throw new Exception(violations.toString());
			}
			
		}catch (MySQLIntegrityConstraintViolationException e) {
			LOG.debug(e);
			throw new MySQLIntegrityConstraintViolationException(e.getMessage());
		}catch(Exception e){
			LOG.error(e);
			throw new Exception(e);
		}

		return resul;
	}

	@Override
	public boolean modificar(Usuario u) throws Exception {
		boolean resul = false;
		
		try {
			Set<ConstraintViolation<Usuario>> violations = validator.validate(u);
			if (violations.isEmpty()) {
				Usuario uComparar = daoUsuario.getById(Long.toString(u.getId()));
				if(uComparar != null) {
					if(u.getRol().getId() < 1) {
						u.getRol().setId(uComparar.getRol().getId());
					}
					
					if(u.getNombre() == null) {
						u.setNombre(uComparar.getNombre());
					}
					
					if(u.getContrasena() == null) {
						u.setContrasena(uComparar.getContrasena());
					}
				}
				
				
				if(daoUsuario.update(u)) {
					LOG.debug("Usuario modificado");
					resul = true;
				}
			}else {
				for (ConstraintViolation<Usuario> violation : violations) {
					LOG.debug("Error de validacion al modificar usuario: " + violation.getPropertyPath() + ": "
							+ violation.getMessage());
				}
				throw new Exception(violations.toString());
			}
		}catch (MySQLIntegrityConstraintViolationException e) {
			LOG.debug(e);
			throw new MySQLIntegrityConstraintViolationException(e.getMessage());
		}catch(Exception e) {
			LOG.error(e);
			throw new Exception(e);
		}
		
		return resul;
	}

	@Override
	public boolean eliminar(long id) throws Exception {
		boolean resul = false;
		try {
			if(daoUsuario.delete(Long.toString(id))) {
				LOG.debug("Usuario eliminado");
				resul = true;
			}
		}catch (MySQLIntegrityConstraintViolationException e) {
			LOG.debug(e);
			throw new MySQLIntegrityConstraintViolationException(e.getMessage());
		}catch(Exception e) {
			LOG.error(e);
			throw new Exception(e);
		}
		
		return resul;
	}

	@Override
	public List<Usuario> listarPublicos() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			usuarios = (ArrayList<Usuario>) daoUsuario.publicList();
			LOG.debug("Listado usuarios publicos");
		} catch (Exception e) {
			LOG.error(e);
		}
		return usuarios;
	}

}

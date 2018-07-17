package com.ipartek.formacion.model;

import java.util.List;

/**
 * Interfaz para especficar los m�todos de <b>Crud</b>:
 *
 * <ul>
 *     <li>Create</li>
 *     <li>Read</li>
 *     <li>Update</li>
 *     <li>Delete</li>
 * </ul>
 * @author Adrian Garcia
 *
 */
public interface CrudAble<P> {
	
	boolean insert(P pojo);
	
	/**
	 * Recupera todos los pojos
	 * @return si no existen resultados retorna lista vac�a, no null
	 */
	List<P> getAll();
	
	/**
	 * Buscamos un pojo por su identificador
	 * @param id long identificador
	 * @return P pojo si lo encuentra, null si no lo encuentra
	 */
	P getById(long id);
	
	boolean update(P pojo);
	
	boolean delete(long id);	
	
}

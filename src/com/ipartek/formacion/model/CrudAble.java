package com.ipartek.formacion.model;

import java.util.List;

import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Interfaz para especficar los m�todos de <b>Crud</b>:
 *
 * <ul>
 *     <li>Create</li>
 *     <li>Read</li>
 *     <li>Update</li>
 *     <li>Delete</li>
 * </ul>
 * @author Curso
 *
 */
public interface CrudAble {
	
	boolean insert(VideoYoutube video);
	
	/**
	 * Recupera todos los VideoYoutube
	 * @return si no existen resultados retorna lista vac�a, no null
	 */
	List<VideoYoutube> getAll();
	
	/**
	 * Buscamos un VideoYoutube por su identificador
	 * @param id long identificador
	 * @return VideoYoutube si lo encuentra, null si no lo encuentra
	 */
	VideoYoutube getById(long id);
	
	boolean update(VideoYoutube video);
	
	boolean delete(long id);	
	
}

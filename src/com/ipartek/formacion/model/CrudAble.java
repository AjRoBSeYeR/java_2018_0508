package com.ipartek.formacion.model;

import java.util.List;

import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Interfaz para especificar los m�todos de <b>CRUD</b>
 * 
 * <ul>
 * 		<li> Create </li>
 * 		<li> Read 	</li>
 * 		<li> Update </li>
 * 		<li> Delete </li>
 * </ul>
 * @author Curso
 *
 */
public interface CrudAble {

	
	boolean insert(VideoYoutube video);	// Create
	
	/**
	 * Recupera todos los VideoYoutube de la lista.
	 * 
	 * @return lista, vac�a si no existen resultados.
	 */
	List<VideoYoutube> getAll();		// Read
	
	/**
	 * Recupera un VideoYoutube cuya id coincide con la <b>id</b> pasada por par�metro.
	 * 
	 * @param id, tipo long
	 * @return VideoYoutube con el video cuya id es igual a la id pasada por par�metro.
	 */
	VideoYoutube getById(long id);		// Read
	
	boolean update(VideoYoutube v);		// Update
	
	boolean delete(long id);			// Delete
	
	
}

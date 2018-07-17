package com.ipartek.formacion.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Clase DAO para gestionar los VideoYoutube con ArrayList Usamos patron
 * Singleton
 * 
 * @see https://es.wikipedia.org/wiki/Singleton#Java
 * @author Curso
 *
 */

public class VideoYoutubeArrayDAO implements CrudAble<VideoYoutube> {

	private static VideoYoutubeArrayDAO INSTANCE = null;
	private static List<VideoYoutube> lista = null;

	private VideoYoutubeArrayDAO() {
		lista = new ArrayList<VideoYoutube>();
	}

	public static synchronized VideoYoutubeArrayDAO getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new VideoYoutubeArrayDAO();
		}

		return INSTANCE;
	}

	@Override
	public boolean insert(VideoYoutube video) {
		boolean resul = false;
		if (video != null) {
			resul = lista.add(video);
		}
		return resul;
	}

	@Override
	public List<VideoYoutube> getAll() {
		return lista;
	}

	@Override
	public VideoYoutube getById(long id) {
		VideoYoutube resul = null;
		//foreach
		for (VideoYoutube videoIteracion : lista) {
			if ( id == videoIteracion.getId() ) {
				resul = videoIteracion;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean update(VideoYoutube videoUpdate) {
		boolean resul = false;
		VideoYoutube videoIteracion = null;
		int i = 0;
		if ( videoUpdate != null ) {
			//Iterator		
			Iterator<VideoYoutube> it = lista.iterator();
			while( it.hasNext() ) {
				videoIteracion = it.next();
				if ( videoIteracion.getId() == videoUpdate.getId() ) {
					lista.set(i, videoUpdate);
					resul = true;
					break;					
				}	
				i++;
			}		
		}	
		return resul;
	}

	
	@Override
	public boolean delete(long id) {		
		boolean resul = false;
		
		VideoYoutube vIteracion = null;
		
		//buscar video a eliminar
		for (int i = 0; i < lista.size(); i++) {
			
			vIteracion = lista.get(i);   //video sobre el que iteramos
			
			if ( id == vIteracion.getId() ) {    // video encontrado
				resul = lista.remove(vIteracion);
				break;
			}
		}
		
		return resul;
	}

}

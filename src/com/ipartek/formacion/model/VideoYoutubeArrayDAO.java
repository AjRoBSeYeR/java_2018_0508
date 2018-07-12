package com.ipartek.formacion.model;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Clase DAO para gestionar los VideoYoutube con ArrayList.
 * Usamos patron Singleton
 * @see https://es.wikipedia.org/wiki/Singleton
 * @author ur00
 * 
 */
public class VideoYoutubeArrayDAO implements CrudAble {

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
		if ( video != null ) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(VideoYoutube video) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}

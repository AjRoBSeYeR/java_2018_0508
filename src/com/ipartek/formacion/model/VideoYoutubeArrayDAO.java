package com.ipartek.formacion.model;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Clase DAO para gestionar los VideoYoutube con ArrayList.
 * Usamos el Patr�n Singleton
 * @see https://es.wikipedia.org/wiki/Singleton#Java
 * @author Curso
 *
 */
public class VideoYoutubeArrayDAO implements CrudAble {
	
	private static VideoYoutubeArrayDAO INSTANCE = null;
	private static ArrayList<VideoYoutube> lista;
	
	
	private VideoYoutubeArrayDAO() {	//	CONSTRUCTOR MEDIANTE SINGLETON PATTERN
		lista = new ArrayList<VideoYoutube>();
	}
	
	public static synchronized VideoYoutubeArrayDAO getInstance() {
        return (INSTANCE == null ? new VideoYoutubeArrayDAO() : INSTANCE);
    }

	@Override
	public boolean insert(VideoYoutube video) {
		boolean result = false;
		if (video != null ) {
			result = lista.add(video);
		}
		return result;
	}

	@Override
	public List<VideoYoutube> getAll() {
		return lista;
	}

	/**
	 * Funci�n que devuelve el video con el id pasado por par�metro.
	 * @param id, tipo long, que representa el identificador del video
	 * @return v, objeto VideoYoutube
	 * Si no encuentra el <b>id</b>, devuelve <b>null</b>
	 */
	@Override
	public VideoYoutube getById(long id) {
		VideoYoutube v = null;
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				v = lista.get(i);
				break;
			}
		}
		return v;
	}

	/**
	 * Funci�n que modifica el video pasado por par�metro.
	 * @param video, objeto de clase VideoYoutube, que representa un video
	 * @see VideoYoutube
	 * @return result, boolean
	 * Si no encuentra el video, devuelve <b>false</b>
	 */
	@Override
	public boolean update(VideoYoutube video) {
		boolean result = false;
		if (video != null) {
			for (int i=0; i<lista.size(); i++) {
				if (lista.get(i).getId() == video.getId()) {
					lista.set(i, video);
					result = true;
				}
			}
		}
		return result;
	}

	/**
	 * Funci�n que elimina el video con el id pasado por par�metro.
	 * @param id, tipo long, que representa el identificador del video
	 * @return result, boolean
	 * Si no encuentra el <b>id</b>, devuelve <b>false</b>
	 */
	@Override
	public boolean delete(long id) {
		boolean result = false;
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				VideoYoutube v = lista.get(i);
				result = lista.remove(v);
			}
		}
		return result;
	}

}

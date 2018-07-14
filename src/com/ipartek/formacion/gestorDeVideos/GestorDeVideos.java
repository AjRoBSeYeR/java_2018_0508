package com.ipartek.formacion.gestorDeVideos;

import java.util.Scanner;

import com.ipartek.formacion.model.VideoYoutubeArrayDAO;
import com.ipartek.formacion.pojo.VideoYoutube;

/**
 * Clase GestorDeVideos para gestionar videos utilizando el model
 * VideoYoutubeArrayDAO
 * 
 * @author Luis
 *
 */
public class GestorDeVideos {

	static private VideoYoutubeArrayDAO dao;
	static private int opcionSeleccionada = 0;
	static Scanner sc = null;

	static private final int OPCION_SALIR = 0;
	static private final int OPCION_LISTAR = 1;
	static private final int OPCION_ANADIR = 2;
	static private final int OPCION_ELIMINAR = 3;

	public static void main(String args[]) {

		sc = new Scanner(System.in);

		dao = VideoYoutubeArrayDAO.getInstance();

		cargarVideos();

		pintarMenu();

		switch (opcionSeleccionada) {
		case OPCION_LISTAR:
			listar();
			break;

		case OPCION_SALIR:
			salir();
			break;
			
		case OPCION_ANADIR:
			anadir();
			break;
			
		case OPCION_ELIMINAR:
			eliminar();
			break;
			
		default:
			noOption();
			break;
		}

	}

	private static void noOption() {
		System.out.println("Lo sentimos, no existe esa opcion");
		pintarMenu();

	}

	private static void cargarVideos() {
		VideoYoutube video = new VideoYoutube(12650, "Nightmares On Wax Boiler Room London DJ Set", "Q692lHFaLVM");
		dao.insert(video);

		video = new VideoYoutube(701, "The Skatalites - Rock Fort Rock", "6bLVdKbPHHY");
		dao.insert(video);

	}

	private static void listar() {

		for (VideoYoutube video : dao.getAll()) {
			System.out.println("    " + video);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");

		pintarMenu();

	}

	private static void salir() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		sc.close();
		System.out.println("AGUR BEN-HUR, esperamos verte pronto");

	}

	private static void anadir() {
		long id;
		String tit;
		String cod;

		System.out.println("Teclea un id: ");
		id = sc.nextLong();

		System.out.println("Teclea un t�tulo: ");
		tit = sc.nextLine();

		System.out.println("Teclea un c�digo: ");
		cod = sc.nextLine();

		VideoYoutube v = new VideoYoutube(id, tit, cod);
		System.out.println(dao.insert(v) ? "Video insertado con �xito." : "Error durante la insersci�n.");

	}

	private static void eliminar() {
		long id;

		listar();
		
		System.out.println("Teclea el id del video que deseas eliminar : ");
		id = sc.nextLong();

		System.out.println(dao.delete(id) ? "Video eliminado con �xito." : "No existe ese video.");
	}

	private static void pintarMenu() {

		System.out.println("------------------------------------");
		System.out.println("--          youtube               --");
		System.out.println("------------------------------------");
		System.out.println("-    1. Listar                     -");
		System.out.println("-    2. A�adir Nuevo               -");
		System.out.println("-    3. Eliminar                   -");
		System.out.println("-                                  -");
		System.out.println("-    0 - salir                     -");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("Dime una opcion por favor");

		opcionSeleccionada = sc.nextInt();

	}

}

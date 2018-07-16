package com.ipartek.formacion.videos;

import java.util.Scanner;

import com.ipartek.formacion.model.VideoYoutubeArrayDAO;
import com.ipartek.formacion.pojo.VideoYoutube;

public class GestorDeVideos2 {

	static Scanner sc = null;

	static private VideoYoutubeArrayDAO dao;

	static private int opcionSeleccionada = -1;

	static private final int OPCION_SALIR = 0;
	static private final int OPCION_LISTAR = 1;
	static private final int OPCION_ANADIR = 2;
	static private final int OPCION_ELIMINAR = 3;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		dao = VideoYoutubeArrayDAO.getInstance(); // Creamos el DAO

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
			a�adir();
			break;

		case OPCION_ELIMINAR:
			eliminar();
			break;

		default:
			noOption();
			break;
		}

		pintarMenu();

	} // FIN main();

	private static void eliminar() {

		long id;

		listar();
		System.out.println("Por favor, teclea el id del video que deseas eliminar : ");
		try {

			id = sc.nextLong();
			System.out.println(dao.delete(id) ? "Video eliminado con �xito." : "No existe ese video.");

		} catch (Exception e) {
			System.out.println("ID NO V�LIDA. Por favor, teclea un ID n�merico correcto.");
			sc.nextLine();
			eliminar();
		}
	} // FIN eliminar();

	private static void a�adir() {

		long id;
		String tit;
		String cod;

		System.out.print("Teclea un id: ");
		try {
			id = sc.nextLong();
			sc.nextLine();

			System.out.print("Teclea un t�tulo: ");
			tit = sc.nextLine();

			System.out.print("Teclea un c�digo: ");
			cod = sc.nextLine();

			VideoYoutube v = new VideoYoutube(id, tit, cod);
			System.out.println(dao.insert(v) ? "Video insertado con �xito."
					: "Lo sentimos, ha ocurrido un error durante la insersci�n.");

		} catch (Exception e) {

			System.out.println("ID NO V�LIDA. Por favor, teclea un ID n�merico correcto.");
			a�adir();
		}
	} // FIN a�adir();

	private static void salir() {

		System.out.println("");
		System.out.println("");
		System.out.println("");
		sc.close();
		System.out.println("AGUR BEN-HUR, esperamos volver a verte. =)");
	}

	private static void listar() {

		if (dao.getAll() != null) {
			for (VideoYoutube video : dao.getAll()) {
				System.out.println("    " + video);
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} else {
			System.out.println("LO SENTIMOS. No hay videos en la lista.");
		}
	}

	private static void pintarMenu() {

		System.out.println("------------------------------------");
		System.out.println("--          YOUTUBE               --");
		System.out.println("------------------------------------");
		System.out.println("-    1. Listar                     -");
		System.out.println("-    2. A�adir Nuevo               -");
		System.out.println("-    3. Eliminar                   -");
		System.out.println("-    0. Salir                     -");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.print("Por favor, selecciona una opci�n del Men�: ");

		opcionSeleccionada = leerOpcion();

	} // FIN pintarMenu();

	private static void cargarVideos() {

		VideoYoutube video = new VideoYoutube(12650, "Crystallion - Crystal Clear", "qllRVZnpttM");
		dao.insert(video);

		video = new VideoYoutube(701, "Crystallion - Burning Bridges", "MSRvZ-YSlZI");
		dao.insert(video);

	} // FIN cargarVideos();

	private static int leerOpcion() {

		try {
			opcionSeleccionada = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {

			System.out.println("OPCI�N NO V�LIDA. Por favor, teclea una opci�n correcta.");
			sc.nextLine();
			pintarMenu();
		}
		return opcionSeleccionada;

	} // FIN leerOpcion();

	private static void noOption() {

		System.out.println("LO SENTIMOS. La opci�n seleccionada no existe.");
		pintarMenu();

	} // FIN noOption();

}

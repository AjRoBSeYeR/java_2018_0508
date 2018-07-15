package com.ipartek.formacion.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * Programa Java para buscar una palabra o una cadena en un fichero de texto.
 * 
 * El programa pedir� que se introduzca una palabra o un texto por teclado y
 * realizar� su b�squeda por todo el archivo. Se mostrar� por pantalla el n�mero
 * de l�nea y el contenido de la l�nea del fichero que contiene la cadena
 * buscada. Si la cadena buscada aparece en varias l�neas se mostrar�n todas
 * ellas. Si el fichero no contiene el texto buscado se mostrar� un mensaje
 * indic�ndolo.
 * 
 * @see Scanner
 * 
 * @author Luis
 *
 */
public class Ejercicio8 {

	static Scanner scConsola = new Scanner(System.in);
	static Scanner scFichero;

	static JFileChooser jfc;

	static String ruta;
	static String busqueda;

	static File fichero;

	static int numLinea = 1;

	static boolean contiene = false;

	public static void main(String[] args) {

		mostrarVentanaFicheros();

		try {

			abrirFichero();
			pedirTextoBusqueda();

			System.out.println("Archivo: " + fichero.getName());
			System.out.println("Texto a buscar: " + busqueda);

			leerFichero();

			if (!contiene) { // si el archivo no contienen el texto se muestra un mensaje indic�ndolo

				System.out.println(busqueda + " no se ha encontrado en el archivo.");
			}

		} catch (FileNotFoundException e) { // No se ha encontrado el archivo
			System.out.println(e.toString());

		} catch (NullPointerException e) { // No se ha seleccionado ning�n archivo
			System.out.println(e.toString() + "No ha seleccionado ning�n archivo");

		} catch (Exception e) { // Ha sucedido cualquier otro error
			System.out.println(e.toString());

		} finally {
			if (scFichero != null) { // Si todo ha ido bien y ya hemos leido el fichero
				scFichero.close();
				System.out.println("Fichero cerrado con �xito.");
			}
		}

		scConsola.close();

	} // FIN main();

	private static void abrirFichero() throws FileNotFoundException {

		fichero = new File(ruta);

		System.out.println("Abriendo fichero..." + ruta);

		scFichero = new Scanner(fichero);

		System.out.println("Fichero abierto con �xito.");

	} // FIN abrirFichero():

	private static void pedirTextoBusqueda() {

		System.out.println("Introduce el texto a buscar:");
		busqueda = scConsola.nextLine();

	} // FIN pedirTextoBusqueda();

	private static void mostrarVentanaFicheros() throws NullPointerException {

		jfc = new JFileChooser(); // Creamos el objeto JFileChooser

		jfc.showOpenDialog(jfc); // Abrimos el jfc en modo "Open"

		ruta = jfc.getSelectedFile().getAbsolutePath(); // Guardamos en ruta la ruta absoluta

	} // FIN mostrarVentanaFicheros();

	private static void leerFichero() {

		String linea;

		while (scFichero.hasNext()) { // Por cada l�nea del fichero

			linea = scFichero.nextLine();
			buscarTexto(linea); // Llamamos a la funci�n buscarTexto
			numLinea++; // Aumentamos en contador de l�neas
		}

	} // FIN leerFichero();

	private static void buscarTexto(String linea) {

		if (linea.contains(busqueda)) {

			System.out.println("Linea " + numLinea + ": " + linea);
			contiene = true;

		}
	} // FIN buscarTexto();

} // FIN Ejercicio8

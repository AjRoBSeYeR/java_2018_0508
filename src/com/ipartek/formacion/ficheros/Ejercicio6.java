package com.ipartek.formacion.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Disponemos de un fichero de texto llamado enteros.txt que contiene n�meros
 * enteros separados por comas, espacios en blanco y tabulaciones. El siguiente
 * programa lee los n�meros usando la clase Scanner y los muestra. Muestra
 * tambi�n la cantidad de n�meros le�dos y su suma. El programa lee l�neas
 * completas del fichero y las pasa a un StringTokenizer del que se extraen los
 * n�meros.
 * 
 * @see Scanner, StringTokenizer
 * 
 * @author Luis
 *
 */
public class Ejercicio6 {

	static Scanner scConsola = new Scanner(System.in); // Scanner que leer� la consola

	static final String DELIM = " ,\t";

	static StringTokenizer tokens;
	static File fichero;

	static int suma;
	static int cont;

	public static void main(String[] args) {

		String ruta = "c:\\enteros.txt";

		System.out.println("Abriendo fichero " + ruta + " con la clase Scanner...");

		try {

			leerFichero(ruta);
			System.out.println("Fichero le�do con �xito.");

		} catch (FileNotFoundException e) { // No existe el fichero en esa ruta

			System.out.println(e.getMessage());
		}

		scConsola.close();
		mostrarResultados();

	} // FIN main();

	private static void mostrarResultados() {

		System.out.println("La suma de los n�meros es:" + suma);

		System.out.println("Leidos " + cont + " n�meros del fichero.");

	} // FIN mostrarResultados();

	/**
	 * Procedimiento que lee los enteros de un fichero. La lectura acaba cuando no
	 * quedan m�s l�neas.
	 * 
	 * @param ruta, String con la ruta del fichero
	 * @throws FileNotFoundException
	 */
	private static void leerFichero(String ruta) throws FileNotFoundException {

		Scanner scFichero = null; // Scanner que leer� el fichero

		String linea;

		fichero = new File("c:\\enteros.txt");

		scFichero = new Scanner(fichero);

		while (scFichero.hasNext()) { // Mientras haya m�s contenido

			linea = scFichero.nextLine(); // Lemmos la siguiente l�nea

			contarNumeros(linea);

		}
		scFichero.close();

	} // FIN leerFichero();

	private static void contarNumeros(String linea) {

		int num; // En esta variable iremos leyendo cada n�mero de la l�nea

		tokens = new StringTokenizer(linea, DELIM);

		while (tokens.hasMoreTokens()) {

			num = Integer.parseInt(tokens.nextToken()); // Parseamos el String a Integer

			System.out.println(num); // Lo mostramos por consola

			suma += num; // Lo sumamos a suma

			cont++; // Lo sumamos al contador de n�mero
		}

	} // FIN contarNumeros();

} // FIN Ejercicio6

package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Mostrar por pantalla el contenido del fichero de texto datos.txt pero en este
 * caso lo vamos a leer car�cter a carcater. El proceso consiste en leer un
 * car�cter del fichero y mostrarlo por pantalla. Este proceso se repite hasta
 * que no queden m�s caracteres que leer en el fichero, es decir, hasta que se
 * alcance el finall del fichero. En este caso el m�todo read() devuelve -1.
 * 
 * @see FileReader, BufferedReader
 * 
 * @author Luis
 *
 */
public class Ejercicio4 {

	static Scanner sc = new Scanner(System.in);

	static FileReader fr = null;

	static BufferedReader br = null;

	public static void main(String[] args) {

		System.out.println("Leyendo el fichero...\n");
		try {

			abrirFichero();

			leerFichero();

			System.out.println("\nFichero leido con �xito.");

		} catch (IOException e) { // Capturamos cualquier excepci�n

			System.out.println(e.getMessage()); // Mostramos el mensaje por consola

		} finally {
			try { // Intentamos cerrar FileReader

				if (null != fr) {
					fr.close(); // Cerramos FileReader
				}

				System.out.println("Fichero cerrado con �xito.");
			} catch (Exception e2) { // Capturamos cualquier excepci�n

				System.out.println(e2.getMessage()); // Mostramos el mensaje por consola
			}

		} // FIN finally

		sc.close();

	} // FIN main();

	private static void abrirFichero() throws FileNotFoundException {

		fr = new FileReader("c:/datos.txt"); // Abrimos el fichero en modo lectura
	}

	private static void leerFichero() throws IOException {

		int car;

		br = new BufferedReader(fr);

		car = br.read(); // Leemos el primer car�cter

		while (car != -1) { // Mientras haya m�s caracteres

			System.out.print((char) car); // Mostramos la l�nea por pantalla
			car = br.read(); // Leemos el siguiente car�cter
		}
	} // FIN leerFichero();

} // FIN Ejercicio4

package com.ipartek.formacion.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * Programa Java que lee un archivo de texto que contiene n�meros de tipo int y
 * double. El archivo a leer est� formado por dos l�neas. La primera l�nea del
 * fichero contiene n�meros enteros separados por espacios en blanco. La segunda
 * l�nea contiene n�meros de tipo double separados tambi�n por espacios en
 * blanco.
 * 
 * @see Scanner
 * @author Luis
 *
 */
public class Ejercicio9 {

	static Scanner scFichero;
	static Scanner scConsola = new Scanner(System.in);

	static JFileChooser jfc;
	static File fichero;
	static String ruta;

	static int contInt;
	static int contDouble;

	static int sumaInt;
	static double sumaDouble;

	public static void main(String[] args) {

		mostrarVentanaFicheros();

		try {

			abrirFichero();

			leerFichero();

		} catch (NullPointerException | FileNotFoundException | InputMismatchException e) { // Error conocido

			System.out.println(e.getMessage());

		} catch (Exception e) { // Error desconocido

			System.out.println(e.getMessage());
		}
		
		mostrarResultados();

	} // FIN main();

	private static void mostrarResultados() {
		
		System.out.println("N�mero de enteros: " + contInt);
		System.out.println("Suma de los enteros: " + sumaInt);
		
		System.out.println("N�mero de Doubles: " + contDouble);
		System.out.println("Suma de los Double: " + sumaDouble);
		
	} // FIN mostrarResultados();

	private static void leerFichero() throws FileNotFoundException {

		scFichero = new Scanner(fichero); // Creamos el Scanner con el fichero seleccionado

		while (scFichero.hasNextInt()) { // Mientras haya m�s enteros

			contar(true);
			System.out.print(" ");
		}
		System.out.println();
		
		while (scFichero.hasNextDouble()) { // Mientras haya m�s doubles

			contar(false);
			System.out.print(" ");
		}
		System.out.println();

	} // FIN leerFichero();

	private static void contar(boolean esEntero) throws InputMismatchException {

		int n;
		double d;

		if (esEntero) { // Es un entero

			n = scFichero.nextInt();
			contInt++;
			sumaInt += n;
			
			System.out.print(n);

		} else { // Es un double

			d = scFichero.nextDouble();
			contDouble++;
			sumaDouble += d;
			
			System.out.print(d);

		}
	} // FIN contar();

	private static void abrirFichero() throws NullPointerException {

		fichero = new File(ruta); // Creamos el fichero con la ruta especificada

	} // FIN abrirFichero();

	private static void mostrarVentanaFicheros() {

		jfc = new JFileChooser();

		jfc.showOpenDialog(jfc);

		ruta = jfc.getSelectedFile().getAbsolutePath();

	} // FIN main();

}

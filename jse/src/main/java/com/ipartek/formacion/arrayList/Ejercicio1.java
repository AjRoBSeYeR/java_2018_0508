package com.ipartek.formacion.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa Java que pida por teclado las alturas de N alumnos de una clase y
 * las guarde en un ArrayList de tipo Double. A continuaci�n el programa
 * calcular� la altura media de todos los alumnos, cuantos alumnos hay m�s altos
 * que la media y cuantos m�s bajos.
 * 
 * @author Curso
 *
 */
public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);

	static ArrayList<Double> alumnos = new ArrayList<>();

	static double media;

	public static void main(String[] args) {

		int n = 0;

		n = numeroAlumnos(); // Pedimos y guardamos el n�mero de alumnos
		leerAlturas(alumnos, n); // Pedimos y guardamos las alturas
		media = calculaMedia(alumnos); // Calculamos la media

		mostrarResultados(alumnos, media); // Mostramos los resultados

	}

	/**
	 * M�todo que pide por teclado el n�mero de alumnos de la clase y devuelve dicho
	 * n�mero al programa principal.
	 * 
	 * @return n, con el n�mero leido por consola.
	 */
	private static int numeroAlumnos() {
		int n;

		System.out.println("Introduce el n�mero de alumnos: ");
		n = sc.nextInt();

		return n;

	}

	/**
	 * pide por teclado las alturas de los N alumnos y las almacena en el ArrayList.
	 * Este m�todo recibe como par�metros el ArrayList inicialmente vac�o y el
	 * n�mero de alumnos a leer.
	 * 
	 * @param alturas, arraylist con las alturas de tipo double
	 * @param n, entero con el n�mero de alturas de la lista
	 */
	private static void leerAlturas(ArrayList<Double> alturas, int n) {

		for (int i = 0; i < n; i++) {

			System.out.println("Introduce altura: ");
			alumnos.add(sc.nextDouble());
		}
	}

	private static double calculaMedia(ArrayList<Double> alturas) {
		double res = 0;

		for (Double altura : alturas) {
			res += altura;
		}

		res /= alturas.size();
		return res;
	}

	private static void mostrarResultados(ArrayList<Double> alturas, double media) {

		int i = 1;

		System.out.println("La media es: " + media);
		System.out.println("---------------------");

		for (Double tmp : alturas) {
			System.out.print("Altura " + i + ": " + tmp);
			System.out.print(tmp > media ? " es mayor que la media.\n" : " es menor que la media.\n");
		}
	}

}

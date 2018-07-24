package com.ipartek.formacion.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Programa que lea una serie de valores num�ricos enteros desde el teclado y
 * los guarde en un ArrayList de tipo Integer. La lectura de n�meros termina
 * cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. A
 * continuaci�n el programa mostrar� por pantalla el n�mero de valores que se
 * han le�do, su suma, su media. Por �ltimo se mostrar�n todos los valores
 * le�dos, indicando cu�ntos de ellos son mayores que la media.
 * 
 * @author Curso
 *
 */
public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> arrayL = leerValores();
		double suma = calcularSuma(arrayL); // Calcular suma
		double media = suma / arrayL.size();

		mostrarResultados(arrayL, suma, media);

	}

	private static ArrayList<Integer> leerValores() {

		ArrayList<Integer> valores = new ArrayList<Integer>();
		System.out.println("Introduce un n�mero entero: ");
		int n = sc.nextInt();

		while (n != -99) {
			valores.add(n);
			System.out.println("Introduce un n�mero entero: ");
			n = sc.nextInt();
		}
		return valores;
	}

	private static double calcularSuma(ArrayList<Integer> valores) {
		double suma = 0;
		Iterator<Integer> it = valores.iterator();

		while (it.hasNext()) { //
			suma = suma + (Integer) it.next(); // next() devuelve un dato de tipo Object. Hay que convertirlo.
		}
		return suma;
	}

	private static void mostrarResultados(ArrayList<Integer> arrayL, double suma, double media) {

		int cont = 0;
		System.out.println("Valores introducidos: ");
		System.out.println(arrayL);

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);

		for (Integer valor : arrayL) {
			if (valor > media) {
				cont++;
			}
		}
		System.out.println("Hay " + cont + " valores mayores que la media.");

	}

}

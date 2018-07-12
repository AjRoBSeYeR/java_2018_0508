package com.ipartek.formacion.arrays;

import java.util.Scanner;

/**
 * Programa Java que guarda en un array 10 n�meros enteros que se leen por
 * teclado. A continuaci�n se recorre el array y calcula cu�ntos n�meros son
 * positivos, cu�ntos negativos y cu�ntos ceros.
 * 
 * @author Curso
 *
 */
public class Ejercicio5 {

	static final int N = 10;

	static Scanner sc = new Scanner(System.in);
	static int[] array = new int[N];

	public static void main(String[] args) {

		int i = 0;

		do {

			System.out.println("Introduce un n�mero: ");
			array[i] = sc.nextInt();
			i++;

		} while (i < N);

		contar();
	}

	private static void contar() {

		int contPos = 0;
		int contNeg = 0;
		int contCero = 0;

		for (int i = 0; i < N; i++) {
			if (array[i] > 0) {
				contPos++;
			} else if (array[i] == 0) {
				contCero++;
			} else {
				contNeg++;
			}
		}

		System.out.println("N�mero de positivos: " + contPos);
		System.out.println("N�mero de negativos: " + contNeg);
		System.out.println("N�mero de ceros: " + contCero);

	}
}

package com.ipartek.formacion.ejercicios.arrays;

import java.util.Scanner;

/**
 * 5. Programa Java que guarda en un array 10 n�meros enteros que se leen por<br>
 * teclado. A continuaci�n se recorre el array y calcula cu�ntos n�meros son<br>
 * positivos, cu�ntos negativos y cu�ntos ceros.<br>
 * 
 * @author Ainara
 *
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		int i;
		int[] num = new int[10];
		int positivos = 0;
		int negativos = 0;
		int cero = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducci�n de n�meros en array: \n");
		for (i = 0; i < num.length; i++) {
			System.out.print("N�meros[" + i + "]= ");
			num[i] = sc.nextInt();
		}

		for (i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				positivos++;
			} else if (num[i] < 0) {
				negativos++;
			} else {
				cero++;
			}
		}

		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + cero);

		sc.close();

	}
}

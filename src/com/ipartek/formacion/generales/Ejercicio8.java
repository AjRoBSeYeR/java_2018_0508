package com.ipartek.formacion.generales;

import java.util.Scanner;

/**
 * La serie de fibonacci la forman una serie de n�meros tales que:
 * 
 * El primer t�rmino de la serie es el n�mero 1 El segundo t�rmino de la serie
 * es el n�mero 1 Los siguientes t�rminos de la serie de fibonacci se obtienen
 * de la suma de los dos anteriores:
 * 
 * 1, 1, 2, 3, 5, 8, 13, .....
 * 
 * Vamos a escribir el programa java que muestra los N primeros n�meros de la
 * serie. El valor de N se lee por teclado.
 * 
 * 
 * import java.util.*; /** Serie de Fibonacci en Java Programa que imprima los N
 * primeros n�meros de la serie de Fibonacci. El primer n�mero de la serie es 1,
 * el segundo n�mero es 1 y cada uno de los siguientes es la suma de los dos
 * anteriores. 1, 1, 2, 3, 5, 8, 13, ....... , N
 * 
 * 
 * @author Ainara
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		int num;
		int fi1;
		int fi2;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Introduce numero mayor que 1: ");
			num = sc.nextInt();

		} while (num <= 1);

		System.out.println("La serie Fibonacci del n�mero " + num + " es: ");

		fi1 = 1;
		fi2 = 1;

		System.out.print(fi1 + " ");

		for (int i = 2; i <= num; i++) {
			System.out.print(fi2 + " ");
			fi2 = fi1 + fi2;
			fi1 = fi2 - fi1;
		}

		sc.close();
	}
}

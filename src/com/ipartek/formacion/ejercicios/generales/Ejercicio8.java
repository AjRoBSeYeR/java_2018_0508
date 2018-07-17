package com.ipartek.formacion.ejercicios.generales;

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
 * @author valen
 *
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1;
		int fibonacci1;
		int fibonacci2;
		do {
			System.out.println("Ingrese numero mayor que 1 = ");
			numero1 = s.nextInt();
		} while (numero1 <= 1);
		System.out.println("Los primeros terminos de la serie de Fobinacci es : " + numero1);
		fibonacci1 = 1;
		fibonacci2 = 1;

		System.out.println(fibonacci1);
		for (int i = 2; i <= numero1; i++) {
			System.out.println(fibonacci2);
			fibonacci2 = fibonacci1 + fibonacci2;
			fibonacci1 = fibonacci2 + fibonacci1;

		}
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.iterativa;

/**
 * Programa Java que muestre los n�meros del 100 al 1 utilizando la instrucci�n
 * while
 * 
 * @author KmK
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		int i =100;
		
		System.out.println("Numeros del 1 al 100: ");
		do {
			System.out.print(" " + i);
			i--;
		} while (i>0);
	}

}
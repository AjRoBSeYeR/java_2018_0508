package com.ipartek.formacion.ejercicios.estructura.iterativa;

/**
 * Programa Java que muestre los n�meros del 1 al 100 utilizando la instrucci�n for
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("N�meros del 1 al 100:");
		
		for (int n1 = 1; n1 <= 100; n1++) {
			if(n1 == 100) {
				System.out.print(n1 +".");
			}else {
				System.out.print(n1 + ", ");
			}
		}

	}

}

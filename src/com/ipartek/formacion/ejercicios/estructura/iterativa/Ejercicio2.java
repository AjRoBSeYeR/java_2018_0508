package com.ipartek.formacion.ejercicios.estructura.iterativa;

/**
 * Programa Java que muestre los n�meros del 1 al 100 utilizando la instrucci�n do..while.
 * @author Curso
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int n1 = 1;
		
		System.out.println("N�meros del 1 al 100:");
		
		do {		
			if(n1 == 100) {
				System.out.print(n1 +".");
			}else {
				System.out.print(n1 + ", ");
			}
			n1++;	
		} while (n1 <= 100);
	}

}

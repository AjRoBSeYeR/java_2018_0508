package com.ipartek.formacion.ejercicios.basicos.estructura.iterativa;

/**
 * 5. Programa Java que muestre los n�meros del 100 al 1 utilizando la
 * instrucci�n do..while
 * 
 * @author Curso
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int num = 100;

		do {
			System.out.println(num);
			num--;
		} while (num != 0);

	}

}
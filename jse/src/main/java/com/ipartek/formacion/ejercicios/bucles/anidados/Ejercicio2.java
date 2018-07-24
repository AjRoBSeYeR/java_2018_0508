package com.ipartek.formacion.ejercicios.bucles.anidados;

import java.util.Scanner;

/**
 * Leer por teclado un n�mero entero N no negativo y mostrar la suma de los<br>
 * factoriales de todos los n�meros desde 0 hasta N. Este ejercicio es una<br>
 * variante del anterior. Para resolverlo basta con a�adir otra variable suma<br>
 * que act�e como acumulador donde sumaremos el factorial obtenido de cada<br>
 * n�mero. La variable suma tambi�n se ha declarado de tipo double igual que la<br>
 * variable factorial.<br>
 * 
 * @author Ainara
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num;
		float factorial;
		float suma = 0;
	
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un n�mero mayor que 0: ");
			num = sc.nextInt();
		} while (num < 0);

		for (int i = 0; i <= num; i++) { 

			factorial = 1;

			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}

			System.out.printf("%n%2d! = %.0f %n \n", i, factorial);

			suma = suma + factorial;
		}

		System.out.printf("La suma de los factoriales desde 0 hasta %d es : %.0f%n", num , suma);
	
		sc.close();
	}

}

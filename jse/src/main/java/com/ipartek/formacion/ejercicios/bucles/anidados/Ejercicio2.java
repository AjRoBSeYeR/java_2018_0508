package com.ipartek.formacion.ejercicios.bucles.anidados;

import java.util.Scanner;

/**
 * Leer un n�mero N y calcular el factorial de los n�meros desde 0 hasta N.
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int factorial;
		
		do {
			System.out.println("Introduce un n�mero");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			
			factorial = 1;
			
			for (int j = 1; j <= i; j++) {
				
				factorial *= j;
				
			}
			
			System.out.println(i + "! = " + factorial);
		}
		
		sc.close();
		
	}

}

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
		
		do {
			System.out.println("Introduce un n�mero");
			n = sc.nextInt();
		} while (n >= 0);

	}

}

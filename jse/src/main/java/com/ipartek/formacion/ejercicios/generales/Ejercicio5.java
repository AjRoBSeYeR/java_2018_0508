package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Leer n�meros y contar cu�ntos acaban en 2.
 * 
 * @author Asier Cornejo
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, contador = 0;
		System.out.print("Introduce un n�mero entero: ");
		n = sc.nextInt();
		while (n >= 0) {
			if (n % 10 == 2)
				contador++;
			System.out.print("Introduce un n�mero entero: ");
			n = sc.nextInt();
		}
		System.out.println("Se han introducido " + contador + " n�meros acabados en 2");
		sc.close();
	}

}

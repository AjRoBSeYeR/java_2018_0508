package com.ipartek.formacion.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que lee un n�mero entero por teclado y obtiene y muestra por
 * pantalla el doble y el triple de ese n�mero.
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	static Scanner sc = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {

		System.out.println("Introduzca un n�mero por teclado:");
		n = sc.nextInt();

		System.out.println("El n�mero introducido es: " + n);
		System.out.println("-------------------------------");

		System.out.println("El doble de " + n + " es: ");
		System.out.println(n * 2);

		System.out.println("-------------------------------");
		System.out.println("El triple de " + n + " es: ");
		System.out.println(n * 3);
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que lea dos n�meros enteros por teclado y los muestre por
 * pantalla.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer n�mero: ");
		int x = teclado.nextInt();

		System.out.print("Introduzca el segundo n�mero: ");
		int y = teclado.nextInt();

		System.out.println(x + " - " + y);
		teclado.close();

	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un n�mero: ");
		int num = teclado.nextInt();
		System.out.println(num + ((num % 5 == 0) ? " es multiplo de 5" : " no es multiplo de 5"));
		teclado.close();
	}

}

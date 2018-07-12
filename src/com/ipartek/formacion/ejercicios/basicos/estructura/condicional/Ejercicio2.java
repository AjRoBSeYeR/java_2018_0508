package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.<br>
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por 10 es resto de esta divisi�n es cero.<br>
 */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un  numero: ");
		num = sc.nextInt();

		String MULTI = (num % 10 == 0) ? "M�LTIPLO" : "NO ES M�LTIPLO";

		System.out.println("El n�mero introducido es: " + MULTI);

		sc.close();

	}

}

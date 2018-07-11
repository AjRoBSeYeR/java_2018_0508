package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Programa que lea un n�mero entero N de 5 cifras y muestre sus cifras igual 
		 * que en el ejemplo.
		 * Por ejemplo para un n�mero N = 12345   La salida debe ser:
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */

		Scanner leer = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un n�mero de 5 cifras");
		
		numero = leer.nextInt();
		
		System.out.println(numero/10000);
		System.out.println(numero/1000);
		System.out.println(numero/100);
		System.out.println(numero/10);
		System.out.println(numero);
		
		leer.close();
		
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/**
		 * Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
		 */
		
		//TODO controlar que solo se introduzcan n�meros enteros
		Scanner leer = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce dos n�meros");
		
		numero1 = leer.nextInt();
		numero2 = leer.nextInt();
		
		System.out.println("El primer n�mero introducido es " + numero1);
		System.out.println("El segundo n�mero introducido es " + numero2);

		leer.close();

	}

}

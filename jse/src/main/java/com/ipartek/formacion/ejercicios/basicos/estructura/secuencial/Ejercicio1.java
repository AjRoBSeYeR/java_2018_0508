package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
* Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
*/
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//TODO controlar que solo se introduzcan n�meros enteros
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce dos n�meros");
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		System.out.println("El primer n�mero introducido es " + numero1);
		System.out.println("El segundo n�mero introducido es " + numero2);

		sc.close();

	}

}

package com.ipartek.formacion.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que lea dos n�meros enteros por teclado y los muestre por
 * pantalla.
 * 
 * @author Curso
 *
 */

public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Introduzca un n�mero por teclado:");
			n = sc.nextInt();
			
			System.out.println("El n�mero introducido es: " + n);
			System.out.println("---------------------------------");
		}
	}

}

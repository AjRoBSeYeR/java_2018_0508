package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que pide un n�mero entero por teclado y calcula y 
 * muestra el n�mero de cifras que tiene.
 * 
 * Por ejemplo si se introduce el n�mero 54391 el programa mostrar� el mensaje:
 * 
 * El n�mero tiene 5 cifras
 * 
 * Si se introduce el n�mero 101 se mostrar� el mensaje:
 * 
 * El n�mero tiene 3 cifras
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		int cifras = 0;
		
		System.out.println("Introduce un n�mero entero");
		numero = sc.nextInt();
		
		while(numero != 0) {
			numero /= 10;
			cifras++;
		}
		
		System.out.println("El n�mero tiene " + cifras + " cifras");
		
		sc.close();

	}

}

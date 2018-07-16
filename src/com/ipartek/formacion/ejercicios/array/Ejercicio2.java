package com.ipartek.formacion.ejercicios.array;

import java.util.Scanner;

/**
 * Programa Java que lea 10 n�meros enteros por teclado y los guarde en un array. 
 * Calcula y muestra la media de los n�meros que est�n en las posiciones pares del array.
 * 
 * Considera la primera posici�n del array (posici�n 0) como par.
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		double media;
		int contadorPares = 0;
		
		int numeros[] = new int[10];
		
		System.out.println("Introduce un n�mero");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			if(numeros[i] % 2 == 0) {
				suma += numeros[i];
				contadorPares++;
			}
		}
		
		media = suma / contadorPares;
		
		System.out.println("La media de los n�meros que est�n en las posiciones pares del array es " + media);
		
		sc.close();
		
	}

}

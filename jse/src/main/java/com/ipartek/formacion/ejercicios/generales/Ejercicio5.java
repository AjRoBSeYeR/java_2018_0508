package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero negativo. 
 * El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		
		do {
			
			System.out.println("Introduzca un n�mero (negativo para finalizar)");
			numero = sc.nextInt();
			
			if(numero % 10 == 2) {
				contador++;
			}
			
		} while (numero >= 0);
		
		System.out.println("Has introducido " + contador + " n�meros acabados en 2");
		
		sc.close();
		
	}

}

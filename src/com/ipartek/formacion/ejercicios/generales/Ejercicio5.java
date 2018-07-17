package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero
 * negativo. El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 * 
 * @author Curso
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int pares = 0;

		do {
			System.out.print("Introduce un numero (negativo para finalizar): ");
			num = sc.nextInt();
			if (num%2==0)
				++pares;
		} while (num >= 0);
		
		System.out.println("Has introducido " + pares + " 1numeros pares.");
		
		sc.close();
	}

}

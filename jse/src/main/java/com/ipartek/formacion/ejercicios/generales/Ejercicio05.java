package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * 5.Programa que lea una serie de n�meros por teclado hasta que se lea un
 * n�mero negativo. El programa indicar� cu�ntos n�meros acabados en 2 se han
 * le�do.
 * 
 * @author Curso
 *
 */
public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int contador = 0;

		do {

			System.out.println("Dame un numero positivo:");
			n = sc.nextInt();

			if (n % 10 == 2) {
				contador++;
			}

		} while (n > 0);

		System.out.println("Has metido " + contador + " numeros acabados en 2.");

		sc.close();

	}

}

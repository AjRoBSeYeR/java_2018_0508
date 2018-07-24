package com.ipartek.formacion.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero
 * negativo. El programa indicar� <br>
 * cu�ntos n�meros acabados en 2 se han le�do.<br>
 * Para saber si un n�mero acaba en dos o en general para saber en qu� d�gito
 * termina un n�mero entero se <br>
 * divide el n�mero entre 10 y se obtiene el resto de esta divisi�n.<br>
 * En Java el operador que obtiene el resto de una divisi�n es el operador %<br>
 * En este caso para saber si el n�mero acaba en 2 escribiremos la
 * instrucci�n:<br>
 * if(n%10==2)<br>
 * 
 * @author Ainara
 * 
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		int num;
		int contador = 0;
		int contador1 = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un n�mero entero: ");
		num = sc.nextInt();
		do {
			contador1++;

			if (num % 10 == 2) {
				contador++;
			}

			System.out.print("Introduce un n�mero entero: ");
			num = sc.nextInt();

		} while (num >= 0);

		System.out.println("Se han introducido " + contador1);
		System.out.println("Se han introducido " + contador + " n�meros acabados en 2");

		sc.close();

	}

}

package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero
 * negativo. El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 * 
 * Para saber si un n�mero acaba en dos o en general para saber en qu� d�gito
 * termina un n�mero entero se divide el n�mero entre 10 y se obtiene el resto
 * de esta divisi�n. En Java el operador que obtiene el resto de una divisi�n es
 * el operador % En este caso para saber si el n�mero acaba en 2 escribiremos la
 * instrucci�n: if(n%10==2)
 * 
 * @author valen
 *
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		int contador = 0;
		System.out.println("Ingrese el numero entero = ");
		numero = s.nextInt();
		while (numero >= 0) {
			if (numero % 10 == 2)
				contador++;
			System.out.println("Ingrese el numero entero = ");
			numero = s.nextInt();
		}
		System.out.println("Numeros acabados en 2 es = ");
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * 1. Programa Java que lea un n�mero entero por teclado y calcule si es par o
 * impar.
 * 
 * Podemos saber si un n�mero es par si el resto de dividir el n�mero entre 2 es
 * igual a cero. En caso contrario el n�mero es impar
 * 
 * El operador Java que calcula el resto de la divisi�n entre dos n�meros
 * enteros o no es el operador %
 * 
 * @author valen
 *
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese el numero = ");
		numero = p.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Es un numero par ");
		} else {
			System.out.println("Es un numero impar");
		}
	}

}

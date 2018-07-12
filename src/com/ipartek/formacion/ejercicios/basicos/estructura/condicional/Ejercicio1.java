package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa Java que lea un n�mero entero por teclado y calcule si es par o
 * impar.<br>
 * Podemos saber si un n�mero es par si el resto de dividir el n�mero entre 2 es
 * igual a cero. <br>
 * En caso contrario el n�mero es impar<br>
 * El operador Java que calcula el resto de la divisi�n entre dos n�meros
 * enteros o no es el operador %<br>
 * 
 * @author Curso
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un  numero: ");
		num = sc.nextInt();

		String PAR = (num % 2 == 0) ? "PAR" : "IMPAR";

		System.out.println("El n�mero introducido es: " + PAR);

		sc.close();

	}

}

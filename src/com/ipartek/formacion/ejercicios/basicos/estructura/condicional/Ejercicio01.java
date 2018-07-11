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
 * @author Curso
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		n=sc.nextInt();
		
		System.out.println("El numero "+n+" es "+((n%2==0)?"par":"impar"));
		sc.close();

	}

}

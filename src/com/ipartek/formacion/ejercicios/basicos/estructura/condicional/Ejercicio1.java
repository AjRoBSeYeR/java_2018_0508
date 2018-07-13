package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.*;

/**
 * Programa Java que lea un n�mero entero por teclado y calcule si es par o
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
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce numero: ");
		num = sc.nextInt();
		if (num%2==0) 
			System.out.println("El numero" + num + " es par");
		else
			System.out.println("El numero" + num + " es impar");
		
		sc.close();
	}

}

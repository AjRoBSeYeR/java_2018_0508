package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * 2. Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de
 * 10.
 * 
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por
 * 10 es resto de esta divisi�n es cero.
 * 
 * @author Curso
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		n = sc.nextInt();
		
		System.out.println("El numero "+n+" "+((n%10==0)?"es":"no es")+" multiplo de 10.");
		sc.close();

	}

}

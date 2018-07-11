package com.ipartek.formacion.ejercicios.estructura.condicional;

import java.util.Scanner;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por 10 es resto de esta divisi�n es cero.
 * @author Curso
 *
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Introduce un numero entero:");
		n1 = teclado.nextInt();
		
		System.out.println();
		if(n1 % 10 == 0) {
			System.out.println(n1 + " es multiplo de 10.");
		}else {
			System.out.println(n1 + " no es multiplo de 10.");
		}
		
		teclado.close();
		
	}

}

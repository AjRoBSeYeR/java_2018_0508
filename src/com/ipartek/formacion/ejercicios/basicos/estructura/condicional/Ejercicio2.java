package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		
		if(numero%10 == 0) {
			System.out.println("Este numero es multiplo de 10");
		}
		else {
			System.out.println("Este numero no es multiplo de 10");
		}
		sc.close();
	}
	

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
* Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
*/
public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		//TODO controlar que solo sean n�meros esnteros
		Scanner sc = new Scanner(System.in);
				
		int numero;
				
		System.out.println("Introduce un n�mero entero");
				
		numero = sc.nextInt();
				
		if(numero % 10 == 0) {
			System.out.println("El n�mero " + numero + " es multiplo de 10");
		}
		else {
			System.out.println("El n�mero " + numero + " no es multiplo de 10");
		}
				
		sc.close();

	}

}

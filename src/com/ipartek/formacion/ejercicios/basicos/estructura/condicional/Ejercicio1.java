package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
* Programa Java que lea un n�mero entero por teclado y calcule si es par o impar.
*/
public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		//TODO controlar que solo sean n�meros esnteros
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un n�mero entero");
		
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El n�mero " + numero + " es par");
		}
		else {
			System.out.println("El n�mero " + numero + " es impar");
		}
		
		sc.close();

	}
	
}

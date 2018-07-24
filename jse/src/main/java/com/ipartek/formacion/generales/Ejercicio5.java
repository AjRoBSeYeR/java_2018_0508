package com.ipartek.formacion.generales;

import java.util.Scanner;

/*
 * Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos
 * sin incluir el propio n�mero.
 * En esta entrada vamos a desarrollar el algoritmo para comprobar si un n�mero es perfecto.
 * El programa pide por teclado un n�mero y muestra si es perfecto o no.
 */
public class Ejercicio5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			sum+= (n%i==0 ? i : 0);
		}
		
		System.out.println(sum == n ? "El n�mero " + n + " es perfecto" : "El n�mero " + n + " no es perfecto.");
		

	}

}

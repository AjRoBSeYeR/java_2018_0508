package com.ipartek.formacion.generales;

import java.util.Scanner;

/*
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero negativo. 
 * El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 */
public class Ejercicio4 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		int cont = 0;
		
		do {
			
			System.out.println("Introduce un n�mero entero: ");
			n = sc.nextInt();
			
			cont+= (n%10==2 ? 1 : 0);
	
		} while (n>=0);
		
		System.out.println("Ha introducido " + cont + " valores terminados en 2.");
	}

}

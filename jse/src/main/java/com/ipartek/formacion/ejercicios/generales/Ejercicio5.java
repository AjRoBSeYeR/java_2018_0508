package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero negativo. El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 * @author Curso
 *
 */
public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1;
		int cont = 0;
		
		do {
			System.out.println("Introduce un numero:");
			n1 = teclado.nextInt();
			System.out.println();
			
			if(n1%10 == 2) {
				cont++;
			}
		} while (n1 >= 0);
		
		System.out.println(cont + " n�meros han terminado en dos.");
		
		teclado.close();
	}

}

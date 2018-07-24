package com.ipartek.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras que tiene.
 * @author Curso
 *
 */

public class Ejercicio2 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int n;
		int cifras;
		
		System.out.println("Introduce un numero entero");
		n= sc.nextInt();
		
		cifras=0;
		while(n!=0) {
			
			n=n/10; //le quitamos el ultimo digito a n
			cifras++;
		}
		
		System.out.println("El numero tiene "+cifras+" cifras");
		
		
		
	}

}

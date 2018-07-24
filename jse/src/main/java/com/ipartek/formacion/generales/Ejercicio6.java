package com.ipartek.formacion.generales;

import java.util.Scanner;

/*
 * Dos n�meros enteros positivos A y B son n�meros amigos si la suma de los divisores 
 * propios de A es igual a B y la suma de los divisores propios de B es igual a A.
 * Programa que comprueba si dos n�meros son amigos.
 */
public class Ejercicio6 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x;
		int y;
		int sumX = 0;
		int sumY = 0;
		
		System.out.println("N�mero 1: ");
		x = sc.nextInt();
		
		for (int i=1; i<x; i++) { // Sumamos los divisores de X
			sumX+= (x%i==0 ? i : 0);
		}
		
		System.out.println("N�mero 2: ");
		y = sc.nextInt();
		
		for (int i=1; i<y; i++) { // Sumamos los divisores de Y
			sumY+= (y%i==0 ? i : 0);
		}
		
		System.out.println((sumX == y && sumY == x) ?  x + " e " + y + " son amigos." 
				: x + " e " + y + " no son amigos.");
		
		

	}

}

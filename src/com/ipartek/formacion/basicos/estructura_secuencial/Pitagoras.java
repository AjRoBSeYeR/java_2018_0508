package com.ipartek.formacion.basicos.estructura_secuencial;

import java.util.Scanner;

/*
 * Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule 
 * la longitud de la hipotenusa seg�n el teorema de Pit�goras. 
 */
public class Pitagoras {

	static Scanner sc = new Scanner(System.in);
	static int a;
	static int b;
	
	public static void main(String[] args) {
		System.out.println("Longitud del cateto A: ");
		a = sc.nextInt();
		System.out.println("Longitud del cateto B: ");
		a = sc.nextInt();
		System.out.println("La hipotenusa de AB es: " + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));

	}

}

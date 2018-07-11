package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * Programa lea la longitud de los catetos de un tri�ngulo 
		 * rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras. 
		 */

		Scanner leer = new Scanner(System.in);

		int cateto1;
		int cateto2;
		double hipotenusa;
		
		System.out.println("Introduce la longitud de los dos catetos de un tri�nculo rect�ngulo en cm");
		
		cateto1 = leer.nextInt();
		cateto2 = leer.nextInt();
		
		hipotenusa = Math.sqrt((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)));
		
		System.out.println("La longitud de la hipotenusa de ese tri�ngulo es " + hipotenusa + "cm");
		
		leer.close();
		
	}

}

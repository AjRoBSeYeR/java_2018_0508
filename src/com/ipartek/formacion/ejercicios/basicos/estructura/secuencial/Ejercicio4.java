package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
 * La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
 * F = 32 + ( 9 * C / 5)
 */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		double gradosC, gradosF;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos grados hace? ");
		gradosC = sc.nextDouble();
		gradosF = 32 + (9 * gradosC / 5);

		System.out.println("Hace: " + gradosC + " �C que son: " + gradosF + " �F ");

		sc.close();
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 
 * @author andreaPerez
 *
 *         Programa que lea una cantidad de grados cent�grados y la pase a
 *         grados Fahrenheit. La f�rmula correspondiente es: F = 32 + ( 9 * C /
 *         5)
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float gradosCent;
		float gradosFah;

		System.out.print("Ingrese grados centigrados: ");
		gradosCent = sc.nextFloat();

		gradosFah = 32 + (9 * gradosCent / 5);
		System.out.println(gradosCent + " �C " + " = " + gradosFah + "�F");
		
		sc.close();
	}

}

package com.ipartek.formacion.basicos.estructura_secuencial;

import java.util.Scanner;

/*
 * Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
 * La f�rmula correspondiente es: F = 32 + ( 9 * C / 5)
 */
public class Grados_Farenheit {

	static Scanner sc = new Scanner(System.in);
	static int n;
	
	public static void main(String[] args) {
		System.out.println("Introduzca un n�mero por teclado:");
		n = sc.nextInt();
		System.out.println(n + "�C = " + (32 +(9*n/5)) + "F");

	}

}

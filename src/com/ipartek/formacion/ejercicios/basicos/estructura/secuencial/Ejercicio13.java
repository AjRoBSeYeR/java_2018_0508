package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 
 * @author Asier Cornejo Programa que calcula el n�mero de la suerte de una
 *         persona a partir de su fecha de nacimiento.
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int a�o;
		int numSuerte;
		int suma;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		System.out.println("Introduzca su fecha de nacimiento");
		System.out.print("d�a: ");
		dia = sc.nextInt();
		System.out.print("mes: ");
		mes = sc.nextInt();
		System.out.print("a�o: ");
		a�o = sc.nextInt();
		suma = dia + mes + a�o;
		cifra1 = suma / 1000;
		cifra2 = suma / 100 % 10;
		cifra3 = suma / 10 % 10;
		cifra4 = suma % 10;
		numSuerte = cifra1 + cifra2 + cifra3 + cifra4;
		System.out.println("Su n�mero de la suerte es: " + numSuerte);
		sc.close();
	}
}

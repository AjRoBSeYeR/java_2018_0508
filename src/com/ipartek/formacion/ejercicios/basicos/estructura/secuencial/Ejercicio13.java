package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.*;

/**
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
 * 28 N�mero de la suerte: 28
 * 
 * @author Curso
 *
 */

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dia;
		int mes;
		int anyo;

		System.out.println("Introduce fecha nacimiento:");
		System.out.print("Dia: ");
		dia = sc.nextInt();
		System.out.print("Mes: ");
		mes = sc.nextInt();
		System.out.print("A�o: ");
		anyo = sc.nextInt();

		int suma = dia + mes + anyo;
		int suerte = ((suma / 1000) % 10) + (suma / 100 % 10) + (suma / 10 % 10) + (suma % 10);

		System.out.print("Tu numero de la suerte es: " + suerte);

		sc.close();
	}

}

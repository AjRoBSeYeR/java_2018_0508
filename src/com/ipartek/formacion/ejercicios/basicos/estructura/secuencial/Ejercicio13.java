package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/**
		 * Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, a�o) 
		 * y calcule su n�mero de la suerte.
		 * El n�mero de la suerte se calcula sumando el d�a, mes y 
		 * a�o de la fecha de nacimiento y a continuaci�n sumando las cifras obtenidas en la suma.
		 * Por ejemplo:
		 * Si la fecha de nacimiento es 12/07/1980 
		 * Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999  1+9+9+9 = 28
		 * N�mero de la suerte: 28
		 */
		
		Scanner leer = new Scanner(System.in);
		
		int dia;
		int mes;
		int anio;
		
		System.out.println("Introduce tu fecha de nacimiento (d�a, mes, a�o)");
		
		dia = leer.nextInt();
		mes = leer.nextInt();
		anio = leer.nextInt();

	}

}

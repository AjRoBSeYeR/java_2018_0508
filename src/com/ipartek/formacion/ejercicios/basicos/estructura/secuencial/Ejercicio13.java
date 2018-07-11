package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, a�o) y calcule su n�mero de la suerte. <br>
 * El n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha de
 * nacimiento y a continuaci�n sumando las cifras obtenidas en la suma.
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca la fecha de su nacimiento (dd/mm/year):  ");
		String[] date = teclado.next().split("/");
		teclado.close();
		int sum = 0;
		int result = 0;
		for (String value : date) {
			sum += Integer.parseInt(value);
		}
		while (sum > 0) {
			result += sum % 10;
			sum /= 10;
		}
		System.out.print("El resultado es: " + result);

	}

}

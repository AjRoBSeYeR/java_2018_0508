package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java para convertir un n�mero entero a n�meros romanos. El programa
 * pide un n�mero entre 1 y 3999 y calcula su equivalente en n�meros romanos. Se
 * utiliza un m�todo llamado convertirANumerosRomanos que recibe el n�mero N a
 * convertir de tipo int y devuelve un String con el equivalente en n�meros
 * romanos. Para convertirlo se obtiene por separado cada cifra del n�mero y se
 * muestran las combinaciones de letras del n�mero romano equivalentes a cada
 * cifra del n�mero original. Este m�todo no utiliza arrays de modo que este
 * programa se puede resolver sin haber estudiado a�n los arrays.
 * 
 * @author valen
 *
 */

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1;
		do {
			System.out.println("Ingresa un numero : ");
			numero1 = s.nextInt();
		} while (numero1 < 1 || numero1 > 3999);
		System.out.println("En numero romanos son = ");
	}

	public static String numerosRomanos(int numero) {
		int i;
		int miles;
		int centenas;
		int decenas;
		return null;

	}
}

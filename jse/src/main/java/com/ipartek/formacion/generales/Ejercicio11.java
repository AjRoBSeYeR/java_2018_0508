package com.ipartek.formacion.generales;

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
 * @author Ainara
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un n�mero entre 1 y 3999: ");
			num = sc.nextInt();
		} while (num < 1 || num > 3999);
		
		System.out.println(num + " en numeros romanos -> " + convertirANumerosRomanos(num));
		
		sc.close();
	}

	public static String convertirANumerosRomanos(int numero) {

		int i;
		int miles;
		int centenas;
		int decenas;
		int unidades;
		String romano = "";

		miles = numero / 1000;
		centenas = numero / 100 % 10;
		decenas = numero / 10 % 10;
		unidades = numero % 10;

		for (i = 1; i <= miles; i++) {
			romano = romano + "M";
		}

		if (centenas == 9) {
			romano = romano + "CM";
		} else if (centenas >= 5) {
			romano = romano + "D";
			for (i = 6; i <= centenas; i++) {
				romano = romano + "C";
			}
		} else if (centenas == 4) {
			romano = romano + "CD";
		} else {
			for (i = 1; i <= centenas; i++) {
				romano = romano + "C";
			}
		} // Fin de bloque if centenas

		if (decenas == 9) {
			romano = romano + "XC";
		} else if (decenas >= 5) {
			romano = romano + "L";
			for (i = 6; i <= decenas; i++) {
				romano = romano + "X";
			}
		} else if (decenas == 4) {
			romano = romano + "XL";
		} else {
			for (i = 1; i <= decenas; i++) {
				romano = romano + "X";
			}
		} // Fin de bloque if decenas

		if (unidades == 9) {
			romano = romano + "IX";
		} else if (unidades >= 5) {
			romano = romano + "V";
			for (i = 6; i <= unidades; i++) {
				romano = romano + "I";
			}
		} else if (unidades == 4) {
			romano = romano + "IV";
		} else {
			for (i = 1; i <= unidades; i++) {
				romano = romano + "I";
			}
		} // Fin de bloque if unidades

		return romano;

	}// Fin de convertirANumerosRomanos

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
 * 28 N�mero de la suerte: 28
 * 
 * @author valen
 *
 */

public class Ejercicio13 {
	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		int suerte;
		int suma;
		int numero1, numero2, numero3, numero4;

		System.out.println("Ingrese el dia de  nacimiento : ");
		dia = m.nextInt();
		System.out.println("Ingrese el mes de nacimiento : ");
		mes = m.nextInt();
		System.out.println("Ingrese el a�o de nacimiento : ");
		ano = m.nextInt();
		suma = dia + mes + ano;
		System.out.println(" La suma = " + suma);

		numero1 = suma / 1000;
		numero2 = suma / 100 % 10;
		numero3 = suma / 10 % 10;
		numero4 = suma % 10;

		System.out.println(" El numero de la suerte es = " + (numero1 + numero2 + numero3 + numero4));

	}

}

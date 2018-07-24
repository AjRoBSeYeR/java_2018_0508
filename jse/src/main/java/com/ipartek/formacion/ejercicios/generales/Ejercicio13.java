package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Comprobar si un n�mero entero es capic�a
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int auxiliar;
		int capicua = 0;
		int cifra;
		
		System.out.println("Introduce un n�mero entero para comprobar si es capic�a");
		numero = sc.nextInt();
		
		auxiliar = numero;
		
		while(auxiliar != 0) {
			cifra = auxiliar % 10;
			capicua = capicua * 10 + cifra;
			auxiliar /= 10;
		}
		
		if(capicua == numero) {
			System.out.println("El n�mero " + numero + " es capic�a");
		}
		else {
			System.out.println("El n�mero " + numero + " no es capic�a");
		}
		
		sc.close();

	}

}

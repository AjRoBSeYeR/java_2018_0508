package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa java que lea un car�cter por teclado y 
 * compruebe si es un d�gito num�rico (cifra entre 0 y 9).
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char caracter;
		
		System.out.println("Introduce un caracter para comprobar si es un d�gito(0-9)");
		
		caracter = sc.next().charAt(0);
		
		if(Character.isDigit(caracter)) {
			System.out.println("El caracter '" + caracter + "' es un d�gito");
		}
		else {
			System.out.println("El caracter '" + caracter + "' no es un d�gito");
		}
		
		sc.close();

	}

}

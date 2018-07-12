package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Asier Cornejo Programa que lea un car�cter por teclado y compruebe si
 *         es una letra may�scula.
 */
public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char letra;
		System.out.print("Introduzca un car�cter: ");

		letra = (char) System.in.read();

		if (Character.isUpperCase(letra))
			System.out.println(letra + " es una letra may�scula");
		else
			System.out.println(letra + " no es una letra may�scula");
		sc.close();
	}

}

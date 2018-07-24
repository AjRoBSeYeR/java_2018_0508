package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra
 * may�scula<br>
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {

		char carac;

		System.out.println("Introduce una letra: ");
		carac = (char) System.in.read();

		String MAYUS = (Character.isUpperCase(carac)) ? "ES MAYUSCULA" : "ES MINUSCULA";

		System.out.println("El n�mero introducido es: " + MAYUS);

	}
}

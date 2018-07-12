package com.ipartek.formacion.basicos.estructura.condicional;

import java.util.Scanner;

import com.ipartek.formacion.util.Utilidades;

/**
 * Programa Java que lea un n�mero entero y calcule si es par o impar.
 * 
 * @author Curso
 *
 */
public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n;

		n = Utilidades.leerInt(sc);
		System.out.println(esMultiploDe10(n) ? n + " es m�ltiplo de 10" : n + " no es m�ltiplo de 10");

	}

	private static boolean esMultiploDe10(int n) {

		return (n % 10 == 0 ? true : false);
	}

}

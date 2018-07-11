package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa que lea una cantidad de grados cent�grados y la pase a grados
 * Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados a
 * fahrenheit es:<br>
 * F = 32 + ( 9 * C / 5)
 */

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca los grados: ");
		float degrees = teclado.nextFloat();
		System.out.print("Grados Fahrenheit: " + (32 + (9 * degrees / 5)));
		teclado.close();
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.*;

/**
 * Programa que lea una cantidad de grados cent�grados y la pase a grados
 * Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados a
 * fahrenheit es: F = 32 + ( 9 * C / 5)
 * 
 * @author Curso
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		float g;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce temperatura en �C: ");
		g = sc.nextFloat();

		System.out.println(g + "� C --> " + (32 + (9 * g / 5)) + "� F");

		sc.close();
		
	}

}

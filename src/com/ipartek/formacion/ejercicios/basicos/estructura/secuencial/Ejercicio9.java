package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 9. Programa que calcula el �rea de un tri�ngulo a partir de la longitudde<br>
 * sus lados.<br>
 * Ejemplo valido: A=10, B=12, C=6.
 * 
 * @author Curso
 *
 */
public class Ejercicio9 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		double a, b, c, p;

		System.out.print("Introduzca longitud del primer lado del tri�ngulo: ");
		a = scan.nextDouble();

		System.out.print("Introduzca longitud del segundo lado del tri�ngulo: ");
		b = scan.nextDouble();

		System.out.print("Introduzca longitud del tercer lado del tri�ngulo: ");
		c = scan.nextDouble();

		p = (a + b + c) / 2;

		System.out.println("El area es " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));

	}

}

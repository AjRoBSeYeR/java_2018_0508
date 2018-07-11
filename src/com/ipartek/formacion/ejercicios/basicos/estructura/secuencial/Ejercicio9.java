package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.*;

/**
 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las
 * longitudes de sus lados (a, b, c), seg�n la siguiente f�rmula: Area =
 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2 Para calcular la ra�z
 * cuadrada se utiliza el m�todo Math.sqrt()
 * 
 * @author Curso
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;
		double p;
		double area;

		System.out.print("Introduce el lado a: ");
		a = sc.nextFloat();
		System.out.print("Introduce el lado c: ");
		b = sc.nextFloat();
		System.out.print("Introduce el lado c: ");
		c = sc.nextFloat();

		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Area del triangulo: " + area);

		sc.close();

	}

}

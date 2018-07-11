package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Ejercicio 9: Programa Java que calcule el �rea de un tri�ngulo en funci�n de
 * las longitudes de sus lados (a, b, c), seg�n la siguiente f�rmula: Area =
 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2 Para calcular la ra�z
 * cuadrada se utiliza el m�todo Math.sqrt()
 * 
 * @author Curso
 *
 */
public class Ejercicio09 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El primer lado del triangulo:");
		a = sc.nextDouble();
		System.out.println("El segundo lado del triangulo:");
		b = sc.nextDouble();
		System.out.println("El tercer lado del triangulo:");
		c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		System.out.println("El area del triangulo es "+ Math.sqrt((p*(p-a)*(p-b)*(p-c))));
		sc.close();
	}

}

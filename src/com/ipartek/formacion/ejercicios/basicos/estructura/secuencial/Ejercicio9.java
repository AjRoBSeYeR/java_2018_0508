package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las longitudes 
 * de sus lados (a, b, c), seg�n la siguiente f�rmula:  
 * Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
 * donde p =  (a+b+c)/2
 * Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt() 
 */

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double a, b, c, p;
		double area;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a");
		a = sc.nextDouble();
		
		System.out.println("Introduce el valor de b");
		b = sc.nextDouble();
		
		System.out.println("Introduce el valor de c");
		c = sc.nextDouble();
		
		p = (a + b + c)/2;
		
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("El area de ese triangulo es: " + area);
		
		sc.close();
	}

}

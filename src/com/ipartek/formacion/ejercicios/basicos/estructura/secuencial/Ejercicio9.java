package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/**
		 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las 
		 * longitudes de sus lados (a, b, c), seg�n la siguiente f�rmula:  
		 * Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
		 * donde p =  (a+b+c)/2
		 * Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt() 
		 */
		
		Scanner leer = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int p;
		double area;
		
		System.out.println("Introduce tres valores que determinen los lados de un tri�ngulo en cm");
		
		a = leer.nextInt();
		b = leer.nextInt();
		c = leer.nextInt();
		
		p = (a + b + c) / 2;
		
		area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		System.out.println("El area de ese tri�ngulo es " + area + "cm2");
		
		leer.close();

	}

}

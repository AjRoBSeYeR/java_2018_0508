package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las
 * longitudes de sus lados (a, b, c), seg�n la siguiente f�rmula:<br>
 * Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2<br>
 * Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt()<br>
 * 
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Lado 1:  ");
		float a = teclado.nextFloat();
		System.out.print("Lado 2:  ");
		float b = teclado.nextFloat();
		System.out.print("Lado 3:  ");
		float c = teclado.nextFloat();
		float s = (a + b + c) / 2;
		System.out.println("El area es : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
		teclado.close();

	}

}

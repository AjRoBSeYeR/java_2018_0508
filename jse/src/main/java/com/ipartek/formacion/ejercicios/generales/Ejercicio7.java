package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Dos n�meros enteros positivos A y B son n�meros amigos si la suma de los
 * divisores propios de A es igual a B y la suma de los divisores propios de B
 * es igual a A.
 * 
 * Los divisores propios de un n�mero incluyen la unidad pero no el propio
 * n�mero.
 * 
 * Un ejemplo de n�meros amigos son los n�meros 220 y 284. Los divisores propios
 * de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110. La suma de los divisores
 * propios de 220 da como resultado 284 Los divisores propios de 284 son 1, 2,
 * 4, 71 y 142. La suma de los divisores propios de 284 da como resultado 220.
 * Por lo tanto 220 y 284 son amigos.
 * 
 * Otras parejas de n�meros amigos son:
 * 
 * 1184, 1210 2620, 2924 5020, 5564 6232, 6368 10744, 10856 12285, 14595 17296,
 * 18416
 * 
 * Vamos a escribir el programa que calcula si dos n�meros son amigos:
 * 
 * @author valen
 *
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1;
		int numero2;
		int i ;
		int suma;
		System.out.println("Ingrese el primer numero = ");
		numero1 = s.nextInt();
		System.out.println("Ingrese el segundo numero = ");
		numero2 = s.nextInt();
		
	}

}

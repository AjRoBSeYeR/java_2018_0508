package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Comprobar si un n�mero es perfecto.
 * 
 * Qu� es un n�mero perfecto?
 * 
 * Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos 
 * sin incluir el propio n�mero.
 * 
 * Por ejemplo, el n�mero 6 es perfecto. 
 * 
 * El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor 
 * para comprobar si es perfecto.
 * 
 * Si sumamos 1 + 2 + 3 = 6 
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero; 
		int suma = 0;
		
		System.out.println("Introduce un n�mero para saber si es perfecto");
		numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				suma += i;
			}
		}
		
		if (suma == numero) {
			System.out.println("El n�mero " + numero + " es perfecto");
		}
		else {
			System.out.println("El n�mero " + numero + " no es perfecto");
		}
		
		sc.close();

	}

}

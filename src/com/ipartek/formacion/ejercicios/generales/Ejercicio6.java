package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
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
 * Los siguientes n�meros perfectos despu�s del 6 son 28, 496, 8128, 33550336,
 * 8589869056.
 * 
 * En esta entrada vamos a desarrollar el algoritmo para comprobar si un n�mero
 * es perfecto. El programa pide por teclado un n�mero y muestra si es perfecto
 * o no. mediante un bucle for sumaremos los divisores del n�mero. Al final si
 * esta suma es igual al n�mero mostraremos el mensaje correspondiente.
 * 
 * Programa java para calcular si un n�mero es perfecto:
 * 
 * @author valen
 *
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		int suma = 0;
		int i = 0;

		System.out.println("Ingrese el numero : ");
		numero = s.nextInt();
		for (i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma = suma + i;

			}
		}
		if (suma == numero) {

			System.out.println("El numero es perfecto  ");

		} else {
			System.out.println("El numero no es perfecto  ");
		}
	}

}

package com.ipartek.formacion.generales;

import java.util.Scanner;

/**
 * �Qu� es un n�mero perfecto?<br>
 * Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos
 * sin incluir el propio n�mero.<br>
 * Por ejemplo, el n�mero 6 es perfecto. <br>
 * El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor
 * para comprobar si es perfecto.<br>
 * Si sumamos 1 + 2 + 3 = 6 <br>
 * Los siguientes n�meros perfectos despu�s del 6 son 28, 496, 8128, 33550336,
 * 8589869056.<br>
 * En esta entrada vamos a desarrollar el algoritmo para comprobar si un n�mero
 * es perfecto.<br>
 * El programa pide por teclado un n�mero y muestra si es perfecto o no.<br>
 * Mediante un bucle for sumaremos los divisores del n�mero. Al final si esta
 * suma es igual al n�mero mostraremos el mensaje correspondiente.<br>
 * 
 * @author Ainara
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int i;
		int suma = 0;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero: ");
		num = sc.nextInt();

		for (i = 1; i < num; i++) {

			if (num % i == 0) {
				suma = suma + i;
			}

		} // Fin de for

		if (suma == num) {

			System.out.println("Perfecto");

		} else {

			System.out.println("No es perfecto");

		} // fin de if-else

		sc.close();
	}
}

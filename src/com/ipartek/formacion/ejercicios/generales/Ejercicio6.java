package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
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
 * @author Curso
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Comprobacion de numeros perfectos.");
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();

		int suma = 0;

		for (int i = 1; i < num; i++) {
			if (num%i==0)
				suma = suma + i;
		}

		System.out.println("Numero: " + num + " / suma divisores: " + suma);
		if (num==suma)
			System.out.println("El numero es perfecto.");
		else
			System.out.println("El numero NO es perfecto.");

		sc.close();
	}

}

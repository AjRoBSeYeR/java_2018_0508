package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * 
 * Comprobar si un n�mero es perfecto.<br>
 * 
 * Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos
 * sin incluir el propio n�mero.
 * 
 * @author Asier Cornejo
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		int suma = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == num) {
			System.out.println("El n�mero " + num + " es perfecto");
		} else {
			System.out.println("El n�mero " + num + " no es perfecto");

		}
		sc.close();
	}

}

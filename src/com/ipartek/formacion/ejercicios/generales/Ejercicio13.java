package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Comprobar si un n�mero entero es capic�a<br>
 * 
 * Un n�mero es capic�a si se puede leer igual de derecha a izquierda que de
 * izquierda a derecha.
 * 
 * @author Asier Cornejo
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		int numero;
		int faltante;
		int numeroInvertido;
		int restante;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n Introduzca un n�mero:\n");
		numero = sc.nextInt();

		faltante = numero;
		numeroInvertido = 0;
		restante = 0;

		while (faltante != 0) {

			restante = faltante % 10;
			numeroInvertido = numeroInvertido * 10 + restante;
			faltante = faltante / 10;

		}

		if (numeroInvertido == numero) {

			System.out.println("\n El numero es capicua\n");

		} else {

			System.out.println("\n El numero no es capicua\n");
		}
		sc.close();
	}

}

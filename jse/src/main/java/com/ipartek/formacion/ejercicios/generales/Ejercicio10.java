package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * CONVERTIR UN N�MERO DE BINARIO A DECIMAL EN JAVA El programa para pasar un
 * n�mero expresado en binario a decimal se basa en la forma tradicional de
 * hacerlo. Los d�gitos del n�mero binario ocupan una posici�n que se numera de
 * derecha a izquierda empezando por cero. La posici�n del d�gito m�s a la
 * derecha es la 0.
 * 
 * Numero Binario: 1 1 0 1 0 1 Posici�n que ocupa cada d�gito 5 4 3 2 1 0
 * 
 * Para pasar el n�mero a decimal se multiplica cada d�gito binario por 2
 * elevado a la posici�n que ocupa. La suma de todos los productos es el
 * equivalente en decimal.
 * 
 * @author valen
 *
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		long numero1;
		long digito;
		long decimal;
		long a;

		int e;
		boolean binario;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Ingresa un numero binario : ");
			numero1 = s.nextLong();
			binario = true;
			a = numero1;
			while (a != 0) {
				digito = a % 10;
				if (digito != 0 && digito != 1) {
					binario = false;

				}
				a = a / 10;
			}
		} while (!binario);
		e = 0;
		decimal = 0;
		while (numero1 != 0) {
			digito = numero1 % 10;
			decimal = decimal + digito * (int) Math.pow(2, e);
			e++;
			numero1 = numero1 / 10;
		}

		System.out.println("El numero decial es " + decimal);

	}

}

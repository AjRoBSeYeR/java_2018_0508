package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa que lea dos n�meros por teclado y muestre el resultado de la
 * divisi�n del primer n�mero por el segundo. Se debe comprobar que el divisor
 * no puede ser cero.
 * 
 * @author Curso
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1;
		float num2;

		System.out.print("Introduce un n�mero: ");
		num1 = sc.nextInt();
		do {
			System.out.print("Introduce otro n�mero: ");
			num2 = sc.nextInt();
			if (num2 == 0)
				System.out.println("El n�mero no puede ser 0 !!!");
		} while (num2 == 0);

		System.out.println(num1 + "/" + num2 + " = " + (num1 / num2) );
		sc.close();
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * El programa lee por teclado tres n�meros enteros y calcula y muestra el mayor
 * de los tres.
 * 
 * @author Curso
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		int resul = 0;
		
		System.out.print("Introduce n�mero 1: ");
		num1 = sc.nextInt();
		System.out.print("Introduce un n�mero 2: ");
		num2 = sc.nextInt();
		System.out.print("Introduce un n�mero 3: ");
		num3 = sc.nextInt();

		if (num1 >= num2) {
			if (num1 >= num3) 
				resul = num1;
		} else {
			if (num2 >= num3) {
				resul = num2;
			} else {
				resul = num3;
			}
		}

		System.out.println("El mayor es " + resul);

		
		sc.close();
	}

}

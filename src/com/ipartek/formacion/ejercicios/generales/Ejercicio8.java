package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Mostrar los N primeros t�rminos de la serie de Fibonacci.<br>
 * 
 * La serie de fibonacci la forman una serie de n�meros tales que:<br>
 * 
 * El primer t�rmino de la serie es el n�mero 1 El segundo t�rmino de la
 * serie<br>
 * es el n�mero 1 Los siguientes t�rminos de la serie de fibonacci se
 * obtienen<br>
 * de la suma de los dos anteriores
 * 
 * @author Asier Cornejo
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int fibo1;
		int fibo2;
		do {
			System.out.print("Introduce numero de numeros que quieres ver de la serie Fibonacci: ");
			num = sc.nextInt();
		} while (num <= 1);
		System.out.println("Los " + num + " primeros numeros de la serie de Fibonacci son:");

		fibo1 = 1;
		fibo2 = 1;

		System.out.print(fibo1 + " ");
		for (int i = 2; i <= num; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
		sc.close();
	}

}

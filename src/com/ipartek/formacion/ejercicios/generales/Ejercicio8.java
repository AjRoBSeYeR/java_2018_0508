package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Mostrar los N primeros t�rminos de la serie de Fibonacci 
 * La serie de fibonacci la forman una serie de n�meros tales que:
 * 
 * El primer t�rmino de la serie es el n�mero 1
 * El segundo t�rmino de la serie es el n�mero 1
 * Los siguientes t�rminos de la serie de fibonacci se obtienen de la suma 
 * de los dos anteriores:
 * 
 * 1, 1, 2, 3, 5, 8, 13, .....  
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int numero;
		int anteriorTermino = 1;
		int siguienteTermino = 1;
		
		System.out.println("Introduce la cantidad de n�meros que se mostrar�n de la secuencia de fibonacci");
		numero = sc.nextInt();
		
		System.out.println("Los " + numero + " primeros n�meros de la secuencia de fibonacci son:");
		System.out.print(anteriorTermino + " ");
		
		for (int i = 2; i <= numero; i++) {;
			System.out.print(siguienteTermino + " ");
			siguienteTermino += anteriorTermino;
			anteriorTermino = siguienteTermino - anteriorTermino;
		}
		
		sc.close();

	}

}

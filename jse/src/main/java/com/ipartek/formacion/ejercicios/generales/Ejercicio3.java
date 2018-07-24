package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y la convierte a grados kelvin.
 * El proceso de leer grados cent�grados se debe repetir mientras que se responda �S� a la pregunta: Repetir proceso? (S/N)
 * @author Curso
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double temp;
		char car = 'S';
		
		do {
			System.out.println("Introduce una temperatura en �C: ");
			temp = teclado.nextDouble();
			
			System.out.println();
			System.out.println("En grados Kelvin: " + (temp + 273));
			
			System.out.println();
			System.out.println("�Continuar? S/N");
			car = teclado.next().charAt(0);
			System.out.println();
		} while (car!='n' && car != 'N');
		
		teclado.close();

	}
}

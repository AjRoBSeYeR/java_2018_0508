package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y la
 * convierte a grados kelvin.
 * 
 * El proceso de leer grados cent�grados se debe repetir mientras que se
 * responda �S� a la pregunta: Repetir proceso? (S/N)
 * 
 * Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que
 * utilizar la f�rmula:
 * 
 * �K = �C + 273
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double celsius;
		double kel;
		String opcion;
		char op;
				
		do {

			System.out.print("Inroduzca temperatura (�C): ");
			celsius = sc.nextDouble();
			kel = celsius + 273;
			System.out.println("Temperatura en �K: " + kel);
			
			System.out.print("Repetir proceso? (S/N): ");
            opcion = sc.next();
            op = opcion.charAt(0);
            
		} while ( (op=='S') || (op=='s') );
		
		sc.close();
	}

}

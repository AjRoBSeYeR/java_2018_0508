package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * 
 * 
 * @author Asier Cornejo
 * 
 *         Pasar de grados cent�grados a grados kelvin.El proceso de leer grados
 *         cent�grados se debe repetir mientras que se responda �S� a la
 *         pregunta: Repetir proceso? (S/N)Para hacer la conversi�n de grados
 *         Cent�grados a grados Kelvin hay que utilizar la f�rmula: �K = �C +
 *         273
 *
 * 
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double temperatura;
		char car = 0;
		do {
			System.out.println("Introduzca una temperatura en grados Centigrados");
			temperatura = sc.nextDouble();
			System.out.println("Grados kelvin " + (temperatura + 273));
			System.out.println("�Quieres convertir otra cifra en grados kelvin?");
			car = sc.next().charAt(0);

		} while (car == 'S' || car == 's');

		sc.close();
	}

}

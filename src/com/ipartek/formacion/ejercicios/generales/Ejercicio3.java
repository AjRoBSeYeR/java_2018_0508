package com.ipartek.formacion.ejercicios.generales;

import java.io.IOException;
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
 * El programa java para realizar la conversi�n de temperaturas es el siguiente:
 * 
 * @author valen
 *
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double temperatura;
		char respuesta = 'n';
		do {
			System.out.println(" Ingrese la temperatura : ");
			temperatura = s.nextDouble();
			System.out.println("Grados Kelvin es = " + (temperatura + 213));
			System.out.println("�Quieres continuar?");
			String c = s.nextLine();
			c = s.nextLine();
			respuesta = c.charAt(0);
		} while (respuesta == 's');
	}

}

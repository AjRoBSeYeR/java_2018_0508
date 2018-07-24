package com.ipartek.formacion.generales;

import java.io.IOException;
import java.util.Scanner;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y la
 * convierte a grados kelvin.<br>
 * El proceso de leer grados cent�grados se debe repetir mientras que se
 * responda �S� a la pregunta: <br>
 * Repetir proceso? (S/N)<br>
 * Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que
 * utilizar la f�rmula:<br>
 * �K = �C + 273 <br>
 * 
 * @author Ainara
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {

		double c;
		double k;
		char contestacion;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce grados centigrados: ");
			c = sc.nextInt();

			k = c + 273;

			System.out.print(c + " grados centigrados son " + k + " Kelvin.");

			System.out.print("�Quieres continuar? ");
			contestacion = (char) System.in.read();
		} while (contestacion == 'n' && contestacion == 'N');

		sc.close();

	}

}

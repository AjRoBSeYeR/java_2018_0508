package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * 
 * 
 * @author Asier Cornejo
 *
 *
 *         Programa que lea dos caracteres y compruebe si son dos letras
 *         min�sculas.
 */
public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		char letra;
		char letra2;
		System.out.print("Introduzca un car�cter: ");
		letra = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("Introduzca el segundo car�cter: ");
		letra2 = (char) System.in.read();
		if (Character.isLowerCase(letra)) {

			if (Character.isLowerCase(letra2)) {
				System.out.println("Los dos car�cteres " + letra + " y " + letra2 + " son min�sculas");
			} else {
				System.out.println(
						"El car�cter " + letra + "es min�scula pero el car�cter " + letra2 + " no es min�scula");
			}
		} else {
			if (Character.isLowerCase(letra2)) {
				System.out
						.println("El car�cter " + letra + " no es min�scula pero el car�cter " + letra2 + " s� lo es");
			} else {
				System.out.println("Ni el car�cter " + letra + " ni el el car�cter " + letra2 + " son min�sculas");
			}

		}

	}

}

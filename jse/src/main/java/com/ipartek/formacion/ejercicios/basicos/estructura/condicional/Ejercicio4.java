package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * 
 * @author Asier Cornejo
 * 
 *         Programa que lea dos caracteres por teclado y compruebe si son
 *         iguales.
 */
public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		char letra;
		char letra2;
		System.out.print("Introduzca un car�cter: ");
		letra = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("Introduzca el segundo car�cter: ");
		letra2 = (char) System.in.read();
		if (letra == letra2) {
			System.out.println("Los car�cteres " + letra + " y " + letra2 + " son iguales");
		} else {
			System.out.println("Los car�cteres " + letra + " y " + letra2 + " no son iguales");
		}
	}

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * 
 * @author Asier Cornejo
 * 
 *         Programa que lea un car�cter y compruebe si es un n�mero (Car�cter
 *         entre '0' y '9').
 *
 * 
 */
public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		char carac;
		System.out.println("Introduce un car�cter para saber si es un n�mero");
		Scanner sc = new Scanner(System.in);
		carac = (char) System.in.read();
		if (Character.isDigit(carac)) {
			System.out.println("El car�cter " + carac + " es un n�mero");
		} else {
			System.out.println("El car�cter " + carac + " no es un n�mero");
		}
		sc.close();
	}

}

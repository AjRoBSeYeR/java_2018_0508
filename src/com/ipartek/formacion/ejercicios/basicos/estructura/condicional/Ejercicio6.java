package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * 6. Programa que lea un car�cter y compruebe si es un n�mero (Car�cter entre
 * '0' y '9').
 * 
 * @author Curso
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		
		char c1;
		
		System.out.print("Introduzca car�cter: ");
		c1 = (char) System.in.read();
		
		if (Character.isDigit(c1)) {
			System.out.println("Es un n�mero");
		}else {
			System.out.println("No es un n�mero");
		}

	}

}

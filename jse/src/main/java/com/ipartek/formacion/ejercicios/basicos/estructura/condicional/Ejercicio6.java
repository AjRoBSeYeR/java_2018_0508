package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * Programa java que lea un car�cter por teclado y compruebe si es un d�gito
 * num�rico (cifra entre 0 y 9).
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		System.out.print("Introduzca un car�cter: ");
		char ch = (char)System.in.read();
		System.out.println("'"+ch+"'"+((Character.isDigit(ch))?" es un d�gito":" no es un d�gito"));


	}

}

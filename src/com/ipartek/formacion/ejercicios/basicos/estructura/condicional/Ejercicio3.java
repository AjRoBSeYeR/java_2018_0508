package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.io.IOException;

/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra
 * may�scula
 * 
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {

		System.out.print("Introduzca un car�cter: ");
		char ch = (char)System.in.read();
		System.out.println("'"+ch+"'"+((Character.isUpperCase(ch))?" es una leta may�scula":" es una letra min�scula"));

	}

}

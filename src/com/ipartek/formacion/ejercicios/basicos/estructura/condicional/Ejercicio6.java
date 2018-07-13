package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa java que lea un car�cter por teclado y compruebe si es un d�gito
 * num�rico (cifra entre 0 y 9)
 * 
 * @author Curso
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1;
		char c1;

		System.out.print("Introduce un caracter (letra o numero): ");
		s1 = sc.next();
		c1 = s1.charAt(0);
		
		if ((c1>='0')&&(c1<='9'))
			System.out.println(c1 + " es un n�mero");
		else
			System.out.println(c1 + " no es un n�mero");

		sc.close();
	}

}

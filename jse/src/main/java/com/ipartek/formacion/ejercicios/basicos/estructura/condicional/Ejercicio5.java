package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa java que lea dos caracteres por teclado y compruebe si los dos son
 * letras min�sculas
 * 
 * @author Curso
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1;
		String s2;
		char c1;
		char c2;

		System.out.print("Introduce un car�cter: ");
		s1 = sc.next();
		c1 = s1.charAt(0);
		System.out.print("Introduce otro car�cter: ");
		s2 = sc.next();
		c2 = s2.charAt(0);

		if (Character.isLowerCase(c1)) {
			if (Character.isLowerCase(c2))
				System.out.println("Los dos son letras min�sculas");
			else
				System.out.println("El primero es una letra min�scula pero el segundo no");
		} else {
			if (Character.isLowerCase(c2))
				System.out.println("El segundo es una letra min�scula pero el primero no");
			else
				System.out.println("Ninguno es una letra min�scula");
		}
		
		sc.close();
	}
}
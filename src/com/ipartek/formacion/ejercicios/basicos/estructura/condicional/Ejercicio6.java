package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * 6: Programa java que lea un car�cter por teclado y compruebe si es un d�gito
 * num�rico (cifra entre 0 y 9).
 * 
 * Vamos a escribir dos soluciones a este ejercicio.
 * 
 * La primera consiste en comprobar si el car�cter es un d�gito mediante el
 * m�todo isDigit de la clase Character. Este m�todo devuelve true si el
 * car�cter que se le pasa como par�metro es una cifra entre 0 y 9
 * 
 * @author valen
 *
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		char letra;
		System.out.println("Ingrese la letra ");
		letra = p.nextLine().charAt(0);

		if (Character.isDigit(letra)) {
			System.out.println("Es un numero");
		} else {
			System.out.println("No es un numero");
		}
	}

}

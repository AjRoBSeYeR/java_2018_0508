package com.ipartek.formacion.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Escribe un programa Java que lee un n�mero entero por teclado y obtiene y 
		 * muestra por pantalla el doble y el triple de ese n�mero.
		 */
		
		//TODO controlar que solo se introduzcan n�meros enteros
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		
		int numero;
		
		numero = leer.nextInt();
		
		System.out.println("El doble del n�mero introducido es " + 2 * numero);
		System.out.println("El triple del n�mero introducido es " + 3 * numero);
		
		leer.close();
		
	}

}

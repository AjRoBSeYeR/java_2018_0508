package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
* Escribe un programa Java que lee un n�mero entero por teclado y obtiene y 
* muestra por pantalla el doble y el triple de ese n�mero.
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		//TODO controlar que solo se introduzcan n�meros enteros
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		
		int numero;
		
		numero = sc.nextInt();
		
		System.out.println("El doble del n�mero introducido es " + 2 * numero);
		System.out.println("El triple del n�mero introducido es " + 3 * numero);
		
		sc.close();
		
	}

}

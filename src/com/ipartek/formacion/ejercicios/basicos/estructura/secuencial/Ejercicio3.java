package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 
 * @author Asier Cornejo
 * 
 *         Programa Java que lee un n�mero entero por teclado y obtiene y
 *         muestra por pantalla el doble y el triple de ese n�mero.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero");
		num = sc.nextInt();
		System.out.println(
				"El n�mero introducido es: " + num + " , su doble es: " + num * 2 + " y su triple es: " + num * 3);
	}

}

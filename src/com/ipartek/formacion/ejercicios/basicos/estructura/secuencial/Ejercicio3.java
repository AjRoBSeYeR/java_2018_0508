package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Escribe un programa Java que lee un n�mero entero por teclado y obtiene y
 * muestra por pantalla el doble y el triple de<br>
 * ese n�mero.
 * 
 * @author Curso
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero: ");
		num = sc.nextInt();
		
		System.out.println("El n�mero introducido es: " + num);
		
		System.out.println("El doble del n�mero introducido es: " + num * 2);
		
		System.out.println("El triple del n�mero introducido es: " + num * 3);
	
		sc.close();
	}
}

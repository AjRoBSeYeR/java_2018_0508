package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
 * Programa que lea dos n�meros por teclado y muestre el resultado de la divisi�n 
 * del primer n�mero por el segundo. 
 * Se debe comprobar que el divisor no puede ser cero.
 *
 */
public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numerador;
		int divisor;
		int resultado;
		
		System.out.println("Introduce un n�mero a dividir");
		
		numerador = sc.nextInt();
		
		System.out.println("Introduce el n�mero por el cual lo quieres dividir");

		divisor = sc.nextInt();
		
		while(divisor == 0) {
			System.out.println("El divisor no puede ser 0");
			System.out.println("Introduce un n�mero distinto");
			divisor = sc.nextInt();
		}
		
		resultado = numerador / divisor;
		
		System.out.println("El resultado de la divisi�n es " + resultado);
		
		sc.close();
		
	}

}

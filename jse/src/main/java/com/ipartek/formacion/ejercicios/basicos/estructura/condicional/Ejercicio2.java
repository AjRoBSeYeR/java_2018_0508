package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.*;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * 
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por
 * 10 es resto de esta divisi�n es cero.
 * 
 * @author Curso
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce numero: ");
		num = sc.nextInt();
		if (num%10==0) 
			System.out.println("El numero" + num + " es multiplo de 10");
		else
			System.out.println("El numero" + num + " no es multiplo de 10");
		
		sc.close();

		
	}

}

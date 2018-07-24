package com.ipartek.formacion.generales;

import java.util.Scanner;

/*
 * Mostrar la tabla de multiplicar de un n�mero.
 */
public class Ejercicio3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		int p;
		
		System.out.println("Introduzca un n�mero: ");
		n = sc.nextInt();
		
		System.out.println("Tabla del " + n);
		System.out.println("--------------");
		
		for(int i=1; i<=10; i++) {
			p = n *i;
			System.out.println(n + " * " + i + " = " + p);
		}	

	}

}

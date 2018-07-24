package com.ipartek.formacion.generales;

import java.util.Scanner;

/*
 * Escribir un programa Java que pida por teclado un n�mero entero N de m�s 
 * de una cifra y verifique si es capic�a.
 */
public class Ejercicio11 {

	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		int num;
		int aux;
		int inv = 0;
		int dig;
	
		System.out.println("Introduce un n�mero: ");
		num = sc.nextInt();
		
		aux = num;
			while (aux!=0){
	            dig = aux % 10;
	            inv = inv * 10 + dig;
	            aux/= 10;
	        }
		
		System.out.println(num == inv ? "El n�mero es capic�a." : "El n�mero no es capic�a.");

	}

}

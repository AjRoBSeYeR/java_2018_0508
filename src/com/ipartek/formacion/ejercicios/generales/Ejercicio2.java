package com.ipartek.formacion.ejercicios.generales;

import java.util.*;

/**
 * Programa Java que pide un n�mero entero por teclado y calcula y muestra el
 * n�mero de cifras que tiene
 * 
 * @author KmK
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int dig;
		char c;
		String s;

		do{
			System.out.print("Introduce un n�mero entero: ");
			num = sc.nextInt();
			dig= 0;
			
			while (num!=0) {
				num = num/10;
				dig++;
			}
			
			System.out.println("El n�mero tiene " + dig + " digitos");
			System.out.print("Continuar? ");
	        s = sc.next();
	        c = s.charAt(0);
		} while (c!='n' && c != 'N');    
		
		sc.close();
	}

}

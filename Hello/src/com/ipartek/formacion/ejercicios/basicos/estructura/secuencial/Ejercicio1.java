package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
 */

import java.util.Scanner;

public class Ejercicio1 {

	   public static void main(String[] args){

	        int n1, n2;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un n�mero entero: "); 
	        n1 = sc.nextInt();      
	        System.out.println("Introduce otro n�mero entero: "); 
	        n2 = sc.nextInt();  
	        System.out.println("Ha introducido los n�meros: " + n1 + " y " + n2);

	        sc.close();
	    }

}

package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * 
 * Programa Java que lea un n�mero entero de 3 cifras y muestre por separado las cifras del n�mero.
 * 
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args){
		
		int num;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un n�mero de tres cifras: "); 
        num = sc.nextInt(); 
        System.out.println("Primera cifra de " + num + " -> " + (num/100)); 
        System.out.println("Cifra central de " + num + " -> " + (num/10)%10);
        System.out.println("�ltima cifra  de " + num + " -> " + (num%10));
        sc.close();
        
	}
}

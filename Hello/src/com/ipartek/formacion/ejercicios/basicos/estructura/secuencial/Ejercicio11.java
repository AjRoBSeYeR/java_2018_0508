package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * Programa que lea un n�mero entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.<br>
 * Por ejemplo para un n�mero N = 12345   <br>
 * La salida debe ser:<br>
 * 1<br>
 * 12<br>
 * 123<br>
 * 1234<br>
 * 12345<br>
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args){
		
		int num;
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un n�mero de cinco cifras: "); 
        num = sc.nextInt(); 
        System.out.println((num/10000)); 
        System.out.println((num/1000)); 
        System.out.println((num/100)); 
        System.out.println((num/10)); 
        System.out.println((num/1)); 
        sc.close();

	}
}

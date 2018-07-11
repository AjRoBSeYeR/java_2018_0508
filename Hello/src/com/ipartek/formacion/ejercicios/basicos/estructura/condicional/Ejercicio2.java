package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

/**
 *  Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.<br>
 *  Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por 10 es resto de esta divisi�n es cero.<br>
 */

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args){
		
		int num;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un n�mero: "); 
        num = sc.nextInt(); 
		
		String multi=(num%10==0)?"MULTIPLO":"NO MULTIPLO";

		System.out.println("El numero " + num + " es: "+ multi);
		
		sc.close();
	}
}

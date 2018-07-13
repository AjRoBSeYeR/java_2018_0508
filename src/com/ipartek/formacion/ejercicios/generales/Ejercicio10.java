package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Pasar de binario a decimal
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int exponente = 0;
		int cifra;
		int decimal = 0;
		
		System.out.println("Introduce un n�mero binario para pasarlo a decimal");
		numero = sc.nextInt();
		
		while(numero != 0) {
			cifra = numero %10; //Cogemos la �ltima cifra del n�mero binario
			decimal += cifra * Math.pow(2, exponente); //Multiplicamos la cifra por 2 elevado al exponente, �ste depende de la posici�n que ocupe la cifra.
			exponente++;
			numero /= 10; //Dividimos el n�mero binario entre 10 para 'quitar' esa �ltima cifra.
		}
		
		System.out.println(decimal);
		
		sc.close();

	}

}

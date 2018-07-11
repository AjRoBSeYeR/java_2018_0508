package com.ipartek.formacion.ejercicios.basicos.iniciales;

/**
 * Programa java que realice lo siguiente: declarar una variable N de tipo int, 
 * una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
 * A continuaci�n muestra por pantalla: El valor de cada variable, la suma de N + A, 
 * la diferencia de A - N, el valor num�rico correspondiente al car�cter que contiene 
 * la variable C.
 * @author Curso
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 5;
		double a = 4.56;
		char c = 'a';
		double suma = 0;
		double resta = 0;
		
		System.out.println(n);
		System.out.println(a);
		System.out.println(c);
		
		suma = n + a;
		System.out.println(suma);
		
		resta = a - n;
		System.out.println(resta);
		
		System.out.println("Valor numerico del caracter " + c + " : " + (int)c);
	}
	
}

package com.ipartek.formacion.ejercicios.basicos.iniciales;

/**
 *Escribe un programa Java que declare una variable entera N y as�gnale un valor. A continuaci�n escribe las instrucciones que realicen los siguientes:
 *Incrementar N en 77.
 *Decrementarla en 3.
 *Duplicar su valor.
 *Si por ejemplo N = 1 la salida del programa ser�:
 *Valor inicial de N = 1
 *N + 77 = 78
 *N - 3 = 75
 *N * 2 = 150
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		int n = 1;
        System.out.println("Valor inicial de n = " + n);
        System.out.println("n + 77 = " + (n+=77));
        System.out.println("n - 3 = " + (n-=3));
        System.out.println("n * 2 = "+ (n*=2));


		
	}

}
package com.ipartek.formacion.ejercicios.basicos.iniciales;

/***
 * Escribe un programa Java que declare una variable entera N y as�gnale un
 * valor. A continuaci�n escribe las instrucciones que realicen los siguientes:
 * Incrementar N en 77. <br>
 * Decrementarla en 3. 7<br>
 * Duplicar su valor.<br>
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(n += 77);
		System.out.println(n -= 3);
		System.out.println(n *= 2);

	}

}

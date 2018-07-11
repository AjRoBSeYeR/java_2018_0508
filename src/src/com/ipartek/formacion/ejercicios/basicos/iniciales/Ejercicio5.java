package com.ipartek.formacion.ejercicios.basicos.iniciales;

/***
 * Escribe un programa java que declare una variable A de tipo entero y as�gnale
 * un valor. A continuaci�n muestra un mensaje indicando si A es par o impar.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 * Si por ejemplo A = 14 la salida ser� 14 es par <br>
 * Si fuese por ejemplo A = 15 la salida ser�: 15 es impar
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		int num = 5;
		System.out.println((num % 2 == 0) ? "PAR" : "IMPAR");
	}

}

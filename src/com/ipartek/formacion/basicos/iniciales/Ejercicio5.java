package com.ipartek.formacion.basicos.iniciales;

/**
 * Programa Java que declare una variable A de tipo entero y as�gnale un valor.
 * A continuaci�n muestra un mensaje indicando si A es par o impar. Utiliza el
 * operador condicional ( ? : ) dentro del println para resolverlo.
 * 
 * @author Curso
 *
 */
public class Ejercicio5 {

	static int a = 10;

	public static void main(String[] args) {

		System.out.println(a % 2 == 0 ? "El n�mero es par." : "El n�mero es impar");
	}
}

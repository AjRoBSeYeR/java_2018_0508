package com.ipartek.formacion.basicos.iniciales;

/**
 * Programa Java que declare una variable C de tipo entero y as�gnale un valor.
 * A continuaci�n muestra un mensaje indicando si el valor de C es positivo o
 * negativo, si es par o impar, si es m�ltiplo de 5, si es m�ltiplo de 10 y si
 * es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el
 * operador condicional ( ? : ) dentro del println para resolverlo.
 * 
 * @author Curso
 *
 */
public class Ejercicio7 {

	static int c = 100;

	public static void main(String[] args) {

		System.out.println(c < 0 ? "El n�mero es negativo." : "El n�mero es positivo.");
		System.out.println(c % 2 == 0 ? "El n�mero es par." : "El n�mero es impar.");
		System.out.println(c % 5 == 0 ? "El n�mero es m�ltiplo de 5." : "El n�mero no es m�ltiplo de 5.");
		System.out.println(c % 10 == 0 ? "El n�mero es m�ltiplo de 10." : "El n�mero no es m�ltiplo de 10.");
		System.out.println(c > 100 ? "El n�mero es mayor que 100." : "El n�mero es menor que 100.");
	}

}

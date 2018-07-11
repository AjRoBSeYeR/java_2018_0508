package com.ipartek.formacion.ejercicios.basicos.iniciales;

public class Ejercicio6 {

	public static void main(String[] args) {
		/**
		 * Escribe un programa java que declare una variable B de tipo entero y as�gnale un valor. 
		 * A continuaci�n muestra un mensaje indicando si el valor de B es positivo o negativo. 
		 * Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) 
		 * dentro del println para resolverlo.
		 * Si por ejemplo B = 1 la salida ser�
		 * 1 es positivo
		 * Si fuese por ejemplo B = -1 la salida ser�:
		 * -1 es negativo
		 */
		
		int b = 1;
		
		System.out.println((b >= 0)? "El n�mero " + b + " es positivo" : "El n�mero " + b + " es negativo");

	}

}

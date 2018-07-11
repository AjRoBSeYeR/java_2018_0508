package com.ipartek.formacion.ejercicios.basicos.iniciales;

/**
 * Escribe un programa java que declare una variable b de tipo entero y as�gnale un valor. A continuaci�n muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 * Si por ejemplo B = 1 la salida ser�
 * 1 es positivo
 * Si fuese por ejemplo B = -1 la salida ser�:
 * -1 es negativo
 * @author Curso
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = -1;
		
		String estado = (a >= 0)? "Positivo" : "Negativo";
		System.out.println("El numero " + a + " es " + estado);
		
		String estado2 = (b >= 0)? "Positivo" : "Negativo";
		System.out.println("El numero " + b + " es " + estado2);

	}

}

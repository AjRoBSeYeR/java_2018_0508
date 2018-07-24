package com.ipartek.formacion.ejercicios.basicos.iniciales;

/**
 * Escribe un programa java que declare una variable C de tipo entero y as�gnale un valor. A continuaci�n muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es m�ltiplo de 5, si es m�ltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 * Si por ejemplo C = 55 la salida ser�
 * 55 es positivo
 * 55 es impar
 * 55 es m�ltiplo de 5
 * 55 no es m�ltiplo de 10
 * 55 es menor que 100
 * @author Curso
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int c = 55;
		
		String par = (c%2 == 0)? "Par" : "Impar";
		String positivo = (c >= 0)? "Positivo" : "Negativo";
		String multiplo5 = (c%5 == 0)? "multiplo de 5" : "no es multiplo de 5";
		String multiplo10 = (c%10 == 0)? "multiplo de 10" : "no es multiplo de 10";
		String mayor100 = (c > 100)? "es mayor que 100" : "es menor que 100";;
		
		System.out.println("El numero " + c + " es " + par + ", " + positivo + ", " + multiplo5 + ", "+ multiplo10 + " y " + mayor100);

	}

}

package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * En esta entrada vamos a escribir el programa java para convertir un n�mero de
 * decimal a binario.
 * 
 * Para escribir el programa nos vamos a basar en la forma cl�sica de pasar de
 * decimal a binario, o sea, dividir el n�mero entre 2 y quedarnos con el resto
 * de la divisi�n. Esta cifra, que ser� un cero o un uno, es el d�gito de menos
 * peso (m�s a la derecha) del n�mero binario. A continuaci�n volvemos a dividir
 * el cociente que hemos obtenido entre 2 y nos quedamos con el resto de la
 * divisi�n. Esta cifra ser� la segunda por la derecha del n�mero binario. Esta
 * operaci�n se repite hasta que obtengamos un cero como cociente.
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		int numero, exp, digito;
		double binario;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero entero >= 0 ");
			numero = sc.nextInt();
		} while (numero < 0);
		
		exp = 0;
		binario = 0;
		
		while (numero != 0) {
			digito = numero % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp ++;
			numero = numero/2;
		}

		System.out.println("Binario : " +  binario);
		
		sc.close();
	}

}

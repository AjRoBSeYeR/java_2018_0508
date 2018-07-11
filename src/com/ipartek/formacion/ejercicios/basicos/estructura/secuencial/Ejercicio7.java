package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Curso 7. Programa lea la longitud de los catetos de un tri�ngulo
 *         rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de
 *         Pit�goras. hipotenusa -> c = (a)�+(b)�
 */
public class Ejercicio7 {
	public static void main(String[] args) throws Exception {
		double hipotenusa;
		System.out.println("Introduce la altura del triangulo rectangulo:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double alturaT = Double.parseDouble(br.readLine());

		System.out.println("Introduce el largo del triangulo rectangulo:");
		double largoT = Double.parseDouble(br.readLine());

		hipotenusa = (Math.pow(alturaT, 2) + Math.pow(largoT, 2));

		System.out.println(hipotenusa);
	}
}

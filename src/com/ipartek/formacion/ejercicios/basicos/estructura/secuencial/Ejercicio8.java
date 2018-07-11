package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/**
		 * Programa que tome como dato de entrada un n�mero que corresponde a la 
		 * longitud del radio una esfera y nos calcula y escribe el volumen de la 
		 * esfera que se corresponden con dicho radio.
		 * 
		 * La f�rmula para calcular el volumen de la esfera es 
		 * v = (4/3)*PI*r^3
		 */
				
		Scanner leer = new Scanner(System.in);
		
		int radio;
		double volumen;
		
		System.out.println("Introduce el radio de una esfera");
		
		radio = leer.nextInt();
		
		volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("El volumen de esa esfera es " + volumen + "cm3");
		
		leer.close();

	}

}

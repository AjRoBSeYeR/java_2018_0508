package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/*
 * Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
 * La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:F = 32 + ( 9 * C / 5)
 * */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		  Scanner sc = new Scanner(System.in);
	      double gradosC, gradosF;
	      
	      System.out.println("Introduce los grados de hoy:");
	      gradosC=sc.nextDouble();
	      
	      //Pasamos los C a F
	      gradosF = 32 + (9 * gradosC / 5);
	      
	      //Pantalla
	      System.out.println(gradosC+"C� = "+gradosF+"=F");

	}

}

package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y 
 * la convierte a grados kelvin. 
 * 
 * El proceso de leer grados cent�grados se debe repetir mientras que se responda �S� 
 * a la pregunta: Repetir proceso? (S/N)
 * 
 * Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que utilizar la f�rmula:
 * 
 * �K = �C + 273
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grados;
		int kelvin;
		char respuesta;
		
		do {
			
			System.out.println("Introduzca una temperatura en �C");
			grados = sc.nextInt();
			
			kelvin = grados + 273;
			System.out.println(grados + "�C son " + kelvin + " kelvin");
			
			System.out.println("�Quiere repetir el proceso (s/n)?");
			respuesta = sc.next().charAt(0);
			
		} while (respuesta == 's');
		
		System.out.println("Programa finalizado");		
		sc.close();

	}

}

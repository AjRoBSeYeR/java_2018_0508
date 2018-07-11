package com.ipartek.formacion.ejercicios.generales;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y 
 * la convierte a grados kelvin. 
 * El proceso de leer grados cent�grados se debe repetir mientras que se responda �si� 
 * a la pregunta: Repetir proceso? (S/N)
 * Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay 
 * que utilizar la f�rmula:
 * �K = �C + 273
 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String respuesta = "no";
		int gradosC;
		int gradosF;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Cuantos grados hace?");
			gradosC = sc.nextInt();
			
			gradosF = gradosC + 273;
			
			System.out.println("Hacen " + gradosF + " �F");
			System.out.println("Repetir proceso? si/no");
			respuesta = sc.next();
			
		}while(("si").equals(respuesta));
		
		sc.close();
	}

}

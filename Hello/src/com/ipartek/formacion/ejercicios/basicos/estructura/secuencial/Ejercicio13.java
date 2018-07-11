package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, a�o) y calcule su n�mero de la suerte.<br>
 * El n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando las cifras<br>
 *  obtenidas en la suma.<br>
 *  Por ejemplo:<br>
 *  Si la fecha de nacimiento es 12/07/1980 <br>
 *  Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999  1+9+9+9 = 28<br>
 *  N�mero de la suerte: 28<br>
 * @author Curso
 *
 */
public class Ejercicio13 {
	public static void main(String[] args){
		int dia;
		int mes;
		int anio;
		int num;

		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia de nacimiento: "); 
        dia = sc.nextInt();
        System.out.println("Introduce el mes de nacimiento: "); 
        mes = sc.nextInt();
        System.out.println("Introduce el a�o de nacimiento: "); 
        anio = sc.nextInt();
        System.out.println("Tu fecha de nacimiento es:" + dia + "/" + mes + "/" + anio);
        num=(anio/1000)+((anio/100)%10)+((anio/10)%10)+(anio%10);
        System.out.println(num); 
        System.out.println("Tu numero de la suerte es: " +(dia+mes+num));
 
        sc.close();

	}
}

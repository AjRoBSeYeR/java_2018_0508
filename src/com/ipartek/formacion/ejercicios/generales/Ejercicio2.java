package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * 
 * @author Asier Cornejo
 * 
 *         Calcular el n�mero de cifras de un n�mero entero
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int cifras;
		System.out.println("Introduzca un numero con las cifras que desee");
		num = sc.nextInt();
		cifras = 0;
		while (num != 0) {
			num = num / 10;
			cifras++;
		}

		System.out.println("El numero introducido tiene " + cifras + " cifras");
	}

}

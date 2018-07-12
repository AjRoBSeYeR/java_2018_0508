package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.Scanner;

/**
* Programa que lea un car�cter por teclado y compruebe si es una letra may�scula.
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		//TODO controlar que solo se introduzcan caracteres
		Scanner sc = new Scanner(System.in);
		
		char caracter;
		
		System.out.println("Introduzca un caracter");
		
		caracter = sc.next().charAt(0);
		
		if(Character.toUpperCase(caracter) == caracter) {
			System.out.println("El caracter '" + caracter + "' es may�scula");
		}
		else {
			System.out.println("El caracter '" + caracter + "' es minuscula");
		}
		
		sc.close();
		
	}

}

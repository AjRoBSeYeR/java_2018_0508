package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;
 
import java.util.Scanner;

/**
* Programa que lea dos caracteres y compruebe si son dos letras min�sculas.
*/
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char caracter1;
		char caracter2;
		
		System.out.println("Introduce dos caracteres para comprobar si son min�sculas");
		
		caracter1 = sc.next().charAt(0);
		caracter2 = sc.next().charAt(0);
		
		if(Character.isLowerCase(caracter1)) {
			
			if(Character.isLowerCase(caracter2)) {
				System.out.println("Tanto '" + caracter1 + "' como '" + caracter2 + "' son min�sculas");
			}
			
			else {
				System.out.println("'" + caracter1 + "' es min�scula, pero '" + caracter2 + "' es may�scula");
			}
			
		}
		
		else if(Character.isLowerCase(caracter2)){
			System.out.println("'" + caracter2 + "' es min�scula, pero '" + caracter1 + "' es may�scula");
		}
		
		else {
			System.out.println("Ninguno de los caracteres introducidos son min�sculas");
		}
		
		sc.close();

	}

}

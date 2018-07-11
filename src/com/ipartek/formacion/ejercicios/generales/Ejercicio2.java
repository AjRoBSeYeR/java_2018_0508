package com.ipartek.formacion.ejercicios.generales;

/**
 * Programa Java que pide un n�mero entero por teclado y calcula y muestra el 
 * n�mero de cifras que tiene.
 * Por ejemplo si se introduce el n�mero 54391 el programa mostrar� el mensaje:
 * El n�mero tiene 5 cifras
 * Si se introduce el n�mero 101 se mostrar� el mensaje:
 * El n�mero tiene 3 cifras
 * 
 * El proceso leer un n�mero y contar sus cifras se repetir� hasta que se 
 * conteste �no� a la pregunta Continuar? (si/no)
 * Si se responde 'si' se volver� a pedir otro n�mero. 
 * Para saber cu�ntas cifras tiene un n�mero entero haremos lo siguiente:
 * Dividiremos el n�mero sucesivamente entre 10. 
 * En cada divisi�n tomaremos la parte entera y volvemos a dividir. 
 * Este proceso se repite hasta que se obtenga un cero como cociente en la divisi�n.
 */

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		String respuesta = "no";
		int numero;
		int cifras;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//Pedimos un numero por pantalla
			System.out.println("Introduce un numero ");
			numero = sc.nextInt();
			
			//Inicializamos el contador a cero
			cifras = 0;
			//Mientras el numero sea diferente de 0 lo vamos dividiendo entre 10 para 
			//quitarle el ultimo digito
			while(numero!=0) {
				numero = numero/10;
				cifras ++;
			}
			System.out.println("El numero tiene: " + cifras + " cifras");
			System.out.println("Desea continuar?");
			respuesta = sc.next();
			
		}while(("si").equals(respuesta));
		
		sc.close();
	}

}

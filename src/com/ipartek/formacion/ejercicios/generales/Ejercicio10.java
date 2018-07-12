package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa para pasar un n�mero expresado en binario a decimal
 * @author Curso
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		long binario;
		long aux;
		long digito;
		long decimal;
		int exp;
		boolean esBinario;
		
		do {
	          System.out.print("Introduce un numero binario: ");
	          binario = teclado.nextLong();
	          esBinario = true;
	          aux = binario;
	          while (aux != 0) {
	                     digito = aux % 10; //�ltima cifra del n�meros
	                     if (digito != 0 && digito != 1) {
	                          esBinario = false; //no es un n�mero binario
	                     }
	                     aux = aux / 10; //quitamos la �ltima cifra para repetir el proceso
	           }
	    } while (!esBinario);
		
		  exp = 0;
	      decimal = 0; //ser� el equivalente en base decimal
	      while (binario != 0) {
	                //se toma la �ltima cifra
	                digito = binario % 10;
	                //se multiplica por la potencia de 2 correspondiente y se suma al n�mero
	                decimal = decimal + digito * (int) Math.pow(2, exp);
	                //se aumenta el exponente
	                exp++;
	                //se quita la �ltima cifra para repetir el proceso
	                binario = binario / 10;
	      }
	      System.out.println("En decimal: " + decimal);

	      teclado.close();
	}

}


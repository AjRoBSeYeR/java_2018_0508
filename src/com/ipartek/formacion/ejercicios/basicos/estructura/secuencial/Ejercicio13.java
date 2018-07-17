package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/*Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, a�o) y calcule su n�mero de la suerte.
El n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999  1+9+9+9 = 28
N�mero de la suerte: 28*/
public class Ejercicio13 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Variables
		 int dia, mes, aino, suerte, suma, num1, num2, num3, num4;
		 
		//DATOS
		System.out.println("Introduce tu fecha de cumplea�os:");
		System.out.println("Dia:");
		dia=sc.nextInt();
		System.out.println("Mes:");
		mes=sc.nextInt();
		System.out.println("A�o:");
		aino=sc.nextInt();
		
		//CALCULAR NUMERO SUERTE
		suma = dia + mes + aino;
        num1 = suma/1000;      //obtiene la primera cifra
        num2 = suma/100%10;  //obtiene la segunda cifra
        num3 = suma/10%10;   //obtiene la tercera cifra
        num4 = suma%10;        //obtiene la �ltima cifra
        suerte = num1 + num2 + num3 + num4;
		
        System.out.println("El numero de la suerte es:"+suerte);
	}
}

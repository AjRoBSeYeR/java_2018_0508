package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

/**
 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las longitudes de sus lados (a, b, c), seg�n la siguiente<br>
 *  f�rmula:  <br>
 * Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))<br>
 * donde p =  (a+b+c)/2<br>
 * Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt() <br>
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args){
		
		float ladoa;
		float ladob;
		float ladoc;
		float area;
		float p;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del primer lado: "); 
        ladoa = sc.nextFloat(); 
        System.out.println("Introduce la longitud del segundo lado: "); 
        ladob = sc.nextFloat();   
        System.out.println("Introduce la longitud del tercer lado: "); 
        ladoc = sc.nextFloat();   
        p=(ladoa+ladob+ladoc)/2;
        area= (float) Math.sqrt(p*(p-ladoa)*(p-ladob)*(p-ladoc));
        System.out.println("El area del triangulo es: " + area);
	}
}

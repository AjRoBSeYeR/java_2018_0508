package com.ipartek.formacion.ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

/**
 * 
 * @author Asier Cornejo Programa que calcula el �rea de un tri�ngulo a partir
 *         de la longitud de sus lados.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1;
		double lado2;
		double lado3;
		double perimetro;
		System.out.print("Introduzca longitud del primer lado del tri�ngulo: ");
		lado1 = sc.nextDouble();
		System.out.print("Introduzca longitud del segundo lado del tri�ngulo: ");
		lado2 = sc.nextDouble();
		System.out.print("Introduzca longitud del tercer lado del tri�ngulo: ");
		lado3 = sc.nextDouble();
		perimetro = (lado1 + lado2 + lado3) / 2;
		System.out.println("El area del tri�ngulo es: "
				+ Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3)));
		sc.close();
	}

}

package com.ipartek.ejercicios.estructura.secuencial;
import java.util.*;
/**
 * Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
F = 32 + ( 9 * C / 5)
 * @author Curso
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double gradosC, gradosF;
		System.out.println("Introduce los grados centigrados: ");
		gradosC= sc.nextDouble();
		gradosF=32+(9*gradosC/5);
		System.out.println(gradosC +" �C = " + gradosF + " �F");
	}

}

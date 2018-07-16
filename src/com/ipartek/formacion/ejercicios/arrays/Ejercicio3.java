package com.ipartek.formacion.ejercicios.arrays;

import java.util.Scanner;

/**
 * 3. Programa que lee por teclado la nota de los alumnos de una clase y calcula
 * la nota media del grupo. Tambi�n muestra los alumnos con notas superiores a
 * la media. El n�mero de alumnos se lee por teclado. Este programa utiliza un
 * array de elementos de tipo double que contendr� las notas de los alumnos. El
 * tama�o del array ser� el n�mero de alumnos de la clase, por lo tanto primero
 * se pedir� por teclado el n�mero de alumnos y a continuaci�n se crear� el
 * array. Se realizan 3 recorridos sobre el array, el primero para asignar a
 * cada elemento las notas introducidas por teclado, el segundo para sumarlas y
 * calcular la media y el tercero para mostrar los alumnos con notas superiores
 * a la media.
 * 
 * @author Ainara
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int numAlum;
		int i;
		float suma = 0;
		float media;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("�Cuantos alumnos hay? ");
			numAlum = sc.nextInt();
		} while (numAlum <= 0);

		float[] notas = new float[numAlum];

		for (i = 0; i < notas.length; i++) {
			System.out.print("Alumno " + (i + 1) + " Nota final: ");
			notas[i] = sc.nextFloat();
		}

	
		for (i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}

	
		media = suma / notas.length;

		System.out.printf("La nota media del curso es: ", media);


		System.out.println("Listado de notas superiores a la media: ");
		System.out.println("--------------------------------------: ");
		for (i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.println("Alumno n�mero " + (i + 1) + " Nota final: " + notas[i]);
			}
		}
		
		sc.close();
	}
}
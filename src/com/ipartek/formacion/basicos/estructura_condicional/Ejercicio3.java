package com.ipartek.formacion.basicos.estructura_condicional;

import java.util.Scanner;

import com.ipartek.formacion.util.Utilidades;

/**
 * Programa Java que lea un car�cter y diga si es may�scula.
 * 
 * @author Curso
 *
 */
public class Ejercicio3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char c;

		c =  Utilidades.leerString(sc).charAt(0);
		System.out.println(esMayusc(c) ? c + " es may�scula" : c + " no es may�scula");

	}

	private static boolean esMayusc(char c) {

		return (Character.isUpperCase(c)? true : false);
	}

}

package com.ipartek.formacion.file;

import java.io.File;

/**
 * Programa que muestre todas las unidades de disco del ordenador indicando para
 * cada una de ellas el tama�o disponible y el tama�o total.
 * 
 * @author Luis
 *
 */
public class Ejercicio1 {

	static File[] unidades;

	public static void main(String[] args) {

		System.out.println("Leyendo unidades del sistema....");

		cargarUnidades();

		mostrarResultados();
		
		System.out.println("Finalizado con �xito");

	} // FIN main();

	private static void cargarUnidades() {

		unidades = File.listRoots(); // Leemos las unidades del SO con el m�todo listRoots de la clase File

	} // FIN cargarUnidades();

	private static void mostrarResultados() {

		System.out.printf("   %20s %20s %n", "Tama�o Total", "Tama�o disponible");
		for (File file : unidades) {
			System.out.print(file);
			System.out.printf("   %20s %20s %n", file.getTotalSpace(), file.getFreeSpace());
		}
	} // FIN mostrarResultados();

} // FIN Ejercicio1

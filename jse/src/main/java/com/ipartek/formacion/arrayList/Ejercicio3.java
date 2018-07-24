package com.ipartek.formacion.arrayList;

import java.util.ArrayList;

/**
 * M�todo para desplazar todos los componentes de un Array un lugar a la
 * derecha. El �ltimo elemento pasar� a la primera posici�n.
 * 
 * @author Curso
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<Integer> valores = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			valores.add(i);
		}

		System.out.println(valores);

		desplazarDerechaClasico(valores); // Soluci�n 1

		System.out.println(valores);

		desplazarDerechaRapido(valores); // Soluci�n 2

	}

	public static void desplazarDerechaClasico(ArrayList<Integer> valores) {
		int i;

		int aux = valores.get(valores.size() - 1); // Guardamos el �ltimo elemento

		for (i = valores.size() - 1; i > 0; i--) { // Desplazamos los dem�s elementos
			valores.set(i, valores.get(i - 1));
		}
		valores.set(0, aux); // El �ltimo elemento pasa a ser el primero
	}

	public static void desplazarDerechaRapido(ArrayList<Integer> valores) {

		valores.add(0, valores.get(valores.size() - 1)); // Insertamos al principio el �ltimo elemento
		valores.remove(valores.size() - 1); // Lo borramos del final.
	}

}

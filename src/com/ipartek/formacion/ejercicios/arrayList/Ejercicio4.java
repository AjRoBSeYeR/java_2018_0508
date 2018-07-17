package com.ipartek.formacion.ejercicios.arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa Java para calcular el String de mayor longitud de todos los
 * contenidos en un ArrayList de String.
 * 
 * El programa utilizar� los siguientes m�todos adem�s del m�todo main:
 * 
 * M�todo leerArray(): este m�todo recibe como par�metro el arrayList de Strings
 * vac�o. El m�todo pide por teclado cadenas de caracteres y las a�ade al
 * ArrayList. La lectura de cadenas termina cuando se introduce la palabra
 * �FIN�.
 * 
 * M�todo cadenaMasLarga():este m�todo recibe como par�metro el ArrayList de
 * Strings con todas las cadenas le�das anteriormente y devuelve el String de
 * mayor longitud.
 * 
 * @author andreaPerez
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		try {
			ArrayList<String> aString = new ArrayList<>();

			leerArray(aString);

		} catch (Exception e) {
			System.out.println("Uppss...Algo fall� inesperadamente...");
		}

	}

	static void leerArray(ArrayList<String> lista) {

		Scanner sc = new Scanner(System.in);
		String texto;
		boolean resul = false;

		do {
			System.out.println("Introduce palabras(Para terminar poner FIN):");
			texto = sc.next();

			if ("FIN".equalsIgnoreCase(texto)) {
				resul = false;
			} else {
				lista.add(texto);
			}
			sc.nextLine();
		} while (resul == false);

		cadenaMasLarga(lista);

	}

	static void cadenaMasLarga(ArrayList<String> lista) {

		String textoMax = lista.get(0);

		for (int i = 0; i < lista.size(); i++) {
//			if (textoMax < lista.get(i).length()) {
//
//			}

		}
	}

}

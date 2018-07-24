package com.ipartek.formacion.generales;

import java.io.IOException;
import java.util.Scanner;

/**
 * Programa para codificar o decodificar un texto utilizando el m�todo de
 * cifrado de C�sar. Supondremos que el texto solo contiene letras may�sculas o
 * min�sculas. La letras ser�n las correspondientes al alfabeto ingl�s (26
 * caracteres, excluimos la � y �). En este m�todo de cifrado cada letra del
 * texto se sustituye por otra letra que se encuentra N posiciones adelante en
 * el alfabeto. Se considera que el alfabeto es circular, es decir, la letra
 * siguiente a la �z� es la �a�. Por ejemplo, si N es 3, la �a� se transformar�a
 * en �d�, la �b� en �e�, la �c� en �f�, etc.
 * 
 * 
 * 
 * Ejemplo de cifrado C�sar: si el texto es �casa� y N = 3 el texto cifrado es
 * �fdvd�
 * 
 * Para descifrar un texto se realiza la operaci�n contraria. Se calcula la
 * letra que est� N posiciones por detr�s en el alfabeto. Como el alfabeto es
 * circular, la letra anterior a la �a� es la �z�.
 * 
 * El programa pedir� por teclado un texto, a continuaci�n el valor de N y si
 * queremos codificar o decodificar el texto. Finalmente se mostrar� el texto
 * resultante.
 * 
 * 
 * @author Ainara
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) throws IOException {

		int cod;
		char opc;
		String text;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un texto: ");
			text = sc.nextLine();
		} while (text.isEmpty());

		do {
			System.out.print("Introduce el c�digo: ");
			cod = sc.nextInt();
		} while (cod < 1);

		do {
			sc.nextLine();
			System.out.print("(C) cifrar o (D) descifrar?: ");
			opc = (char) System.in.read();
		} while (Character.toUpperCase(opc) != 'C' && Character.toUpperCase(opc) != 'D');

		if (Character.toUpperCase(opc) == 'C') {
			System.out.println("Texto cifrado: " + cifradoCesar(text, cod));
		} else {
			System.out.println("Texto descifrado: " + descifradoCesar(text, cod));
		}

		sc.close();
	}

	public static String cifradoCesar(String text, int cod) {

		StringBuilder cifrado = new StringBuilder();

		cod = cod % 26;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if ((text.charAt(i) + cod) > 'z') {
					cifrado.append((char) (text.charAt(i) + cod - 26));
				} else {
					cifrado.append((char) (text.charAt(i) + cod));
				}
			} else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				if ((text.charAt(i) + cod) > 'Z') {
					cifrado.append((char) (text.charAt(i) + cod - 26));
				} else {
					cifrado.append((char) (text.charAt(i) + cod));
				}
			} // Fin del primer IF
		} // Fin del FOR

		return cifrado.toString();

	}// Fin del metodo cifradoCesar

	public static String descifradoCesar(String text, int cod) {

		StringBuilder cifrado = new StringBuilder();

		cod = cod % 26;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {

				if ((text.charAt(i) - cod) < 'a') {
					cifrado.append((char) (text.charAt(i) - cod + 26));
				} else {
					cifrado.append((char) (text.charAt(i) - cod));
				}

			} else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {

				if ((text.charAt(i) - cod) < 'A') {
					cifrado.append((char) (text.charAt(i) - cod + 26));
				} else {
					cifrado.append((char) (text.charAt(i) - cod));
				}

			} // Fin del primer IF

		} // Fin del FOR

		return cifrado.toString();

	}// Fin del metodo descifradoCesar

} // Fin cifrado Cesar
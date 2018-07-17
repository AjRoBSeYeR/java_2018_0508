package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * El n�mero 12 en decimal es el 1100 en binario. El n�mero binario se obtiene
 * tomando los restos en orden inverso a como se han obtenido.
 * 
 * Los que ya sab�is algo de Java podeis pensar que para qu� quiero hacer ese
 * programa si simplemente escribiendo la instrucci�n:
 * 
 * System.out.println(Integer.toBinaryString(numero));
 * 
 * se mostrar� el n�mero en binario. El m�todo toBinaryString de la clase
 * Integer ya me hace el trabajo, pero se trata de que seamos capaces de
 * desarrollar por nosotros mismos el algoritmo que realiza la conversi�n de
 * decimal a binario. Este ejercicio se suele plantear cuando se est� comenzando
 * a aprender las estructuras repetitivas (while, for, do while) y a�n no se
 * conocen los arrays por lo que la soluci�n que se plantea no utiliza arrays y
 * por tanto esta soluci�n aunque es correcta solo es v�lida para n�meros
 * enteros relativamente peque�os.
 * 
 * @author valen
 *
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		int numero1;
		int digito;
		double binario;
		int e;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Ingresa un numero entero : ");
			numero1 = s.nextInt();
		} while (numero1 < 0);
		e = 0;
		binario = 0;
		while (numero1 != 0) {
			digito = numero1 % 2;
			binario = binario + digito * Math.pow(10, e);
			e++;
			numero1 = numero1 / 2;

		}
		System.out.println(binario);
	}

}

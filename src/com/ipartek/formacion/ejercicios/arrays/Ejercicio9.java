package com.ipartek.formacion.ejercicios.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * En esta entrada vamos a escribir un m�todo Java que llene un array de enteros<br>
 * con n�meros aleatorios. Los n�meros aleatorios deber�n estar comprendidos<br>
 * entre dos l�mites (desde, hasta) ambos incluidos. El m�todo recibe como<br>
 * par�metros los valores desde, hasta y el tama�o del array. El m�todo devuelve<br>
 * mediante return el array de enteros creado. Para obtener n�meros enteros<br>
 * aleatorios usaremos el m�todo nextInt() de la clase Random.<br>
 * 
 * @author Ainara
 *
 */

public class Ejercicio9 {

	public static int[] main(int desde, int hasta, int tam) {
		  ArrayList<Integer> array = new ArrayList<Integer>();
	        for (int i = desde; i <= hasta; i++) {
	            array.add(i);
	        }
	        Collections.shuffle(array);
	        int [] numeros = new int[tam];
	        for(int i = 0; i<numeros.length; i++){
	            numeros[i]=array.get(i);
	        }
	        return numeros;
	}

}

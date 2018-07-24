package com.ipartek.formacion.ejercicios;

import java.util.HashMap;
import java.util.HashSet;import java.util.Map;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		
		Set<Integer> setOfIntegers = new HashSet<Integer>();
		setOfIntegers.add(Integer.valueOf(10));
		setOfIntegers.add(Integer.valueOf(11));
		setOfIntegers.add(Integer.valueOf(10));
		for (Integer i : setOfIntegers) {
		  System.out.println("Integer value is: " + i);
		}
		
		HashMap<String, String> hmPaises = new HashMap<String, String>();
		
		hmPaises.put("En_en", "Ingl�s de Inglaterra");
		hmPaises.put("Es_es", "Espa�ol de Espa�a");
		hmPaises.put("Es_eu", "Euskera de Espa�a");
		hmPaises.put("Es_ct", "Catal�n de Espa�a");
		hmPaises.put("ct", "Catal�n de Espa�a");
		
		for(Map.Entry<String, String> pais : hmPaises.entrySet()) {
			System.out.println(pais.getKey() + " => " + pais.getValue());
		}
		
	}

}
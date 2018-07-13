package com.ipartek.formacion.basicos.estructura_condicional;

import java.util.Scanner;

/**
 * Programa Java que lea 2 caracteres y compruebe si son min�sculas.
 * 
 * @author Curso
 *
 */
public class Ejercicio5 {

	static Scanner sc = new Scanner(System.in);
	    
	    public static void main(String args[]) {
	        
	        char c = leerCaracter().charAt(0);
	        char c2 = leerCaracter().charAt(0);
	        
	        System.out.println(Character.isLowerCase(c) ? "'" + c + "' es min�scula" : "'" + c + "' no es min�scula"); 
	        System.out.println(Character.isLowerCase(c2) ? "'" + c2 + "' es min�scula" : "'" + c2 + "' no es min�scula"); 
	    }
	    
	    private static String leerCaracter() {
	        
	        System.out.println("Introduce un car�cter: ");
	        return sc.next();
	    }

}

package com.ipartek.formacion.ejercicios.basicos.estructura.condicional;

import java.util.*;

/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra
 * may�scula
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        char c1;
        
        System.out.print("Introduce un car�cter: ");
        s = sc.next();
        c1 = s.charAt(0);
        
        
        if(Character.isUpperCase(c1)) 
           System.out.println("Es una letra may�scula");    
        else
            System.out.println("No es una letra may�scula");   
		
        sc.close();
	}

}

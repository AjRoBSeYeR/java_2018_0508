package com.ipartek.formacion.ejercicios;
import java.util.ArrayList;
import java.util.List;

public class MisExcepciones {
	public static void main(String[] args) {
		System.out.println("Comenzamos ejecuci�n");
		try {
			/*Object o = null;
			o.toString();*/
			
			List<String> paises = new ArrayList<String>();
			
			
			paises.add("Espa�a");
			paises.add("Fracia");
			paises.add("Italia");
			paises.add("Alemania");
			System.out.println("Array==> "+ paises);
			
			System.out.println("Pais 20: "+paises.get(20));

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error con el ArrayList");
		}
			
		/*} catch (Exception e) {
			System.out.println("Usuario=> Lo sentimos pero ha surgido un problema.");
			System.out.println("LOG=> " + e);
			
		} finally {
			System.out.println("Terminamos ejecuci�n (Siempre se ejecute)");
		}*/

	}

		
}

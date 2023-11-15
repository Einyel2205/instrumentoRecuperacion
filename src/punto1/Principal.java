/*
 * Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
- Total personas registradas
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 

 */
package punto1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<String> listaPersonas=new ArrayList<String>();
		
		String documento, nombre, profesion, repetir;
		int edad = 0, n, perosnasMayores = 0, personasMenores=0;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a registrar"));
		
		
		
		for (int i = 0; i < n; i++) {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona "+(i+1));
			listaPersonas.add(nombre);
			documento=JOptionPane.showInputDialog("Ingrese el docuemnto de la persona "+(i+1));
			listaPersonas.add(documento);
			edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona "+(i+1)));
			listaPersonas.add(String.valueOf(edad));
			profesion=JOptionPane.showInputDialog("Ingrese la profesion de la persona "+(i+1));
			listaPersonas.add(profesion);
			
		
			if (edad>=18) {
				perosnasMayores++;
			} else {
				personasMenores++;
			}
			
		}
		
		
		
			System.out.println("ingresos totales: "+n);
			System.out.println("perosnas mayores: "+perosnasMayores);
			System.out.println("personas menores: "+personasMenores);
			
		
	}
}

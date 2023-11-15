/*
 * Haga un algoritmo donde se construya un arreglo resultante de la suma de 2 arreglos del mismo tamaño, el nuevo arreglo mostrará en cada posición el resultado de la suma de las mismas posiciones de los otros 2, para el llenado de los 2 arreglos, solicite el ingreso al usuario, adicionalmente debe mostrar el contenido de los 3 arreglos, tanto los iniciales como el resultante.
 */
package punto2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		
		int numeros=0;
		numeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de los arreglos a sumar"));
		
		int[] arreglo1=new int[numeros];
		int[] arreglo2=new int[numeros];
		
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion "+(i+1)+" del arreglo 1"));
			
		}
		for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion "+(i+1)+" del arreglo 2"));
		}
		
		
		int[] sumaArreglos=new int[numeros];
		
		for (int i = 0; i < numeros; i++) {
			sumaArreglos[i]=arreglo1[i]+arreglo2[i];
		}
		
		System.out.println("Suma Arreglos");
		for (int i = 0; i < numeros; i++) {
			System.out.print(sumaArreglos[i]+ " ");
		}
	}
}

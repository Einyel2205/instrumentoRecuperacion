/*
 * En la nómina de una empresa se le hace descuento a los empleados por concepto de ahorro, de acuerdo al estrato social en que vive, y según la tabla 7. Solicite el nombre de cada empleado y Calcule e imprima el valor a descontar.

Use estructuras de datos para almacenar todos los descuentos realizados e imprímalos.


 */
package punto3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<String> sueldoEmpleados=new ArrayList<String>();
		
		String nombre, continuar = "";
		int estrato;
		int cantidadDescuentos;
		double sueldo, sueldoTotal;
		
		do {
			
			
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
			estrato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del empleado"));
			sueldo=Double.parseDouble(JOptionPane.showInputDialog("ingrese el sueldo del empleado"));
			

			if (estrato==1 || estrato==2) {
				sueldoTotal=sueldo-(sueldo*0.02);
				sueldoEmpleados.add(String.valueOf(sueldoTotal));
			} else {
				if (estrato==3 || estrato==4) {
					sueldoTotal=sueldo-(sueldo*0.04);
					sueldoEmpleados.add(String.valueOf(sueldoTotal));
				} else {
					if (estrato==5) {
						sueldoTotal=sueldo-(sueldo*0.08);
						sueldoEmpleados.add(String.valueOf(sueldoTotal));
					} else {
						if (estrato==6) {
							sueldoTotal=sueldo-(sueldo*0.1);
							sueldoEmpleados.add(String.valueOf(sueldoTotal));
						} else {
							System.out.println("Estrato no valido");
						}
					}

				}
			}
			

			
			
			continuar=JOptionPane.showInputDialog("Ingrese si en caso de querer ingresar otro empleado");
		} while (continuar.equalsIgnoreCase("si"));
		
		System.out.println(sueldoEmpleados);
		
	}
}

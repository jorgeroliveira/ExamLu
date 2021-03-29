package gal.teis.examen_Ejercicio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Holaaaa");
		
		Trabajador t0 = new Trabajador("Paco",45,0);
		Trabajador t1 = new Trabajador("PEPE",45,1);
		Trabajador t2 = new Trabajador("Luis",45,2);
		
		
		System.out.println("sueldo de "+ t0.getNombre()+":"+t0.calcularSueldo());
		
		System.out.println("sueldo de "+ t1.getNombre()+":"+t1.calcularSueldo());
		
		System.out.println("sueldo de "+ t2.getNombre()+":"+t2.calcularSueldo());
		
		
		Directivo dir1 = new Directivo("LOLA", 35, 2, 10);
		System.out.println("sueldo de "+ dir1.getNombre()+":"+dir1.calcularSueldo());
		System.out.println("retencion de "+ dir1.getNombre()+":"+dir1.mostrarRetencion());
		System.out.println("salario liquido de "+ dir1.getNombre()+":"+dir1.mostrarSalarioLiquido());
		
		
		Empleado emp1 = new Empleado("Jose", 20, 0, 10);
		System.out.println("sueldo de "+ emp1.getNombre()+":"+emp1.calcularSueldo());
		System.out.println("retencion de "+ emp1.getNombre()+":"+emp1.mostrarRetencion());
		System.out.println("salario liquido de "+ emp1.getNombre()+":"+emp1.mostrarSalarioLiquido());
			
		Empleado emp2 = new Empleado("loco", 20, 0, 10);
		
		ArrayList<Empleado> lista = new ArrayList<>();
		lista.add(emp2);
		lista.add(emp1);
		
		ver(lista);
	}

	private static void ver(ArrayList<Empleado> lista) {
		for (int i=0; i<lista.size(); i++) {
			Empleado empleadoX = lista.get(i);
			empleadoX.mostrarSalarioLiquido();
		}
	}
	

}

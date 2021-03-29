package gal.teis.examen_Ejercicio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Holaaaa");
		
		Trabajador t0 = new Empleado("Paco",45,0);
		Trabajador t1 = new Directivo("PEPE",45,1);
		Trabajador t2 = new Empleado("Luis",45,2);
		
		
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
			
		
		//Lista polimorfica. lista de trabajadores tanto empleados como directivos.
		//fijarse en la forma de los objetos de tipo Trabajador
		ArrayList<Trabajador> lista = new ArrayList<>();
		Trabajador tr1 = new Empleado("Carlos", 20, 0, 10);
		Trabajador tr2 = new Directivo("Maria", 20, 0, 10);
		Trabajador tr3 = new Empleado("Carmen", 20, 0, 10);
		Trabajador tr4 = new Empleado("Luisa", 20, 0, 10);
		Trabajador tr5 = new Directivo("Manuel", 20, 0, 10);
		lista.add(tr1);
		lista.add(tr2);
		lista.add(tr3);
		lista.add(tr4);
		lista.add(tr5);
		
		verDatos(lista);
		
		verSalarioYParteRetenida(lista);
	}

	private static void verSalarioYParteRetenida(ArrayList<Trabajador> lista) {
		System.out.println("**********Nombre, Salario y Retención de todos los tabajadores***"); 
		
		for (Trabajador item:lista) {
			System.out.println("Nombre:" + item.getNombre());
			System.out.println("Salario:" + item.mostrarSalarioLiquido());
			System.out.println("Retención:" + item.mostrarRetencion());			
		}
		
	}

	private static  void verDatos(ArrayList<Trabajador> lista) {
		System.out.println("**********Nombre, Edad y antiguedad de todos los tabajadores***"); 
		for (int i=0; i<lista.size(); i++) {
			Trabajador empleadoX = lista.get(i);
			System.out.println("Nombre:" + empleadoX.getNombre());
			System.out.println("Edad:" + empleadoX.getEdad());
			System.out.println("Antiguedad:" + empleadoX.getAntiguedad());
		}
	}
	

}

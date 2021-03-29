/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.examen_Ejercicio;

import java.util.Scanner;
import gal.teis.examen_Ejercicio.Empleado;
import java.util.ArrayList;

/**
 *
 * @author lu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Trabajador> listaEmpleados = new ArrayList();
          ArrayList<Trabajador> listaDirectivos = new ArrayList();
          
         Scanner sc = new Scanner(System.in);
        int opcion=0;
    
        //Variables
        do {
     
            System.out.println("Elija la opcion");
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    Empleado e = crearEmpleados();
                    listaEmpleados.add(e);
                 
                    break;

                case 2:
                   Directivo d= crearDirectivos();
                   listaDirectivos.add(d);
                    break;

                case 3:
                    System.out.println("Ver números de trabjadores que se han creado");
                    break;

                case 4:
                    System.out.println("Datos personales de los empleados");
                    break;

                case 5:
                    System.out.println("Salario Líquido");
                    break;
                    
                case 6:
                    System.out.println("Hasta Luego");
                    break;
            }
            
            

        } while (opcion != 6);

    }

   

  static void  mostrarMenu() {

        System.out.println("1- Crear Empleados");
        System.out.println("2- Crear Directivos");
        System.out.println("3- Ver números de trabjadores que se han creado");
        System.out.println("4- Datos personales de los empleados");
        System.out.println("5- Salario Líquido");
        System.out.println("6- Salir");

    }

   
static Empleado crearEmpleados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear un empleado");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Edad del empleado");
        int edadEmpleado= sc.nextInt();
        Empleado empelados= new Empleado (nombreEmpleado,edadEmpleado);
        return empelados;
     
     
    
}

static Directivo crearDirectivos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear un directivo");
        String nombreDirectivo = sc.nextLine();
        System.out.println("Edad del empleado");
        int edadDirectivo= sc.nextInt();
        Directivo directivos = new Directivo(nombreDirectivo, edadDirectivo);
        return directivos;
     
    
}
  

static void verNumeroTrabajadores () {
    //suma de las 2 listas
    
}

static void verDatosEmpleados () {
    
    //2 bucles
}


static void verSalarioLiquidoRetencion (ArrayList<Trabajador>listaEmpleados) {
    
    for (int i = 0; i <listaEmpleados.size; i++) {
        Empleado empleadoX = listaEmpleados.get(i);
        empleadoX.mostrarSalarioLiquido();
    }
    
}



}



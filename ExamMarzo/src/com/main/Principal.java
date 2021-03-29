/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.examen_Ejercicio;

import java.util.Scanner;
import gal.teis.examen_Ejercicio.Empleado;

/**
 *
 * @author lu134632
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion=0;
    
        //Variables
        do {
     
            System.out.println("Elija la opcion");
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
             
                 
                    break;

                case 2:
                    System.out.println("Crear Directivos");
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

   

   
}

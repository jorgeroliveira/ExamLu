/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.examen_Ejercicio;

/**
 *
 * @author luPinheiro
 */
public class Directivo extends Trabajador {
    
    private double IRPF;
    
    public Directivo(String nombre, int edad, int antiguedad) {
        super(nombre, edad, antiguedad);
    }
    
  public double calcularSueldo() {
        
      double sueldo=0;
        sueldo= calcularSueldo()+ 800;
         return sueldo;   
  } 
    
}

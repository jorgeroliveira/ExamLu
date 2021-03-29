/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.examen_Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author luPinheio
 */
public class Departamento {
    
    private String nombre;
    private Directivo jefe_departamento;
    private ArrayList <Trabajador> listaTrabajadores = new ArrayList ();

   
    
    public Departamento (String nombre){
    this.nombre= nombre;
    }
    
    
    public Departamento (Directivo jefe_departamento) {
        
    }
   
    
      public Departamento (String nombre,Directivo jefe_departamento,ArrayList <Trabajador> listaTrabajadores) {
        this.nombre= nombre;
        this.jefe_departamento=jefe_departamento;
        this.listaTrabajadores=listaTrabajadores;
       
        
    }
      
     //getts y setts
      
      public String getNombre (String nombre) {
      return nombre;
      }
      
      public void setNombre () {
          this.nombre=nombre;
      }
      
      public Directivo getJefe_departamento () {
          return jefe_departamento;
      }
      
      public void setJefe_departamento () {
          this.jefe_departamento=jefe_departamento;
      }
      
      
      public ArrayList <Trabajador>  getTrabajadores () {
          return listaTrabajadores;
      }
      
      public void setTrabajadores (ArrayList <Trabajador> listaTrabajadores) {
          
          this.listaTrabajadores= listaTrabajadores;
      }
      
}

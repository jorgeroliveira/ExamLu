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
public class Empleado extends Trabajador {
    
    private double IRPF;
    
    public Empleado (String nombre, int edad) {
       super(nombre, edad);
    }
    
    
    public Empleado(String nombre, int edad, int antiguedad) {
        super(nombre, edad, antiguedad);
    }

    public Empleado(double IRPF, String nombre, int edad, int antiguedad) {
        super(nombre, edad, antiguedad);
        this.IRPF = IRPF;
    }

    
    
    
    
    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }
    
    
    
    
    
    public double calcularSueldo() {
        
      double sueldo=0;
        sueldo= super.calcularSueldo()+ 350;
          return sueldo;   
  } 

    public double mostrarRetencion () {
        double retencion=0;
        retencion = (calcularSueldo() *  IRPF/100);
        
        return retencion;
    }
    
    public double mostrarSalario () {
        double salario=0;
        salario = (calcularSueldo()- mostrarRetencion());
        return salario;
    }
    
}

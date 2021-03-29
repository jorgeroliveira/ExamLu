/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.examen_Ejercicio;

/**
 *
 * @author luPinheio
 */
class Trabajador {

    private String nombre;
    private int edad;
    private int antiguedad;

    static double sueldoBase = 1200;

    public static int ANT_NOVATO = 0;
    public static int ANT_MADURO = 1;
    public static int ANT_EXPERTO = 2;

    public Trabajador(String nombre, int edad, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    
    
    
    
    public int getANTNOVATO() {
        return ANT_NOVATO;
    }

    
    public void setANTNOVATO(int ANT_MADURO) {
        this.ANT_MADURO = 0;
    }

    
    
    
    
    public static int getANT_MADURO() {
        return ANT_MADURO;
    }

    public static void setANT_MADURO(int ANT_MADURO) {
        Trabajador.ANT_MADURO = ANT_MADURO;
    }

    
    
    
    
    public static double getSueldoBase() {
        return sueldoBase;
    }

    public static void setSueldoBase(int sueldoBase) {
        Trabajador.sueldoBase = sueldoBase;
    }

    
    
    
    
    public static int getANT_NOVATO() {
        return ANT_NOVATO;
    }

    public static void setANT_NOVATO(int ANT_NOVATO) {
        Trabajador.ANT_NOVATO = ANT_NOVATO;
    }

    
    
    
    public static int getANT_EXPERTO() {
        return ANT_EXPERTO;
    }

    public static void setANT_EXPERTO(int ANT_EXPERTO) {
        Trabajador.ANT_EXPERTO = ANT_EXPERTO;
    }
    
    
    //método
    
    public double calcularSueldo() {
        return sueldoBase + this.sueldoBase + 150 + sueldoBase + this.sueldoBase + 300 +
                sueldoBase + this.sueldoBase + 600;
    }
    
    

}

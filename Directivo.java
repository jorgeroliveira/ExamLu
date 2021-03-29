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
class Directivo extends Trabajador {

    private String nombre;
    private int edad;
    private int antiguedad;
    private double IRPF;
    private double suedoBase;

    public Directivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Directivo(String nombre, int edad, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public Directivo(String nombre, int edad, int antiguedad, double IRPF) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.IRPF = IRPF;
    }

    public double calcularSuedo() {
        int opcion = 0;

        switch (opcion) {
            case 1:
                suedoBase = this.suedoBase + 150;

                break;

            case 2:
                suedoBase = this.suedoBase + 300;

                break;

            case 3:
                suedoBase = this.suedoBase + 600;
                break;

        }

        return opcion;

    }

    public double mostrarRetencion() {
        return suedoBase + ( * % IRPF / 100);
    }

    public double mostrarSalarioLiquido() {
        return suedoBase +  =  (suedoBase -  % IRPF / 100);
   
     }
}


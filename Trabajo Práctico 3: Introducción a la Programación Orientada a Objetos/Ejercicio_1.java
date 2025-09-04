/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_3;

class Estudiante {

    String nombre = "Guillermina";
    String apellido = "Bianchi";
    String curso = "Programacion II";
    double calificacion = 6;

    public String mostrarInfo() {

        String info = "Nombre: " + this.nombre + " Apellido: " + this.apellido + " curso: " + this.curso + " y su calificacion es de: " + this.calificacion;
        return info;

    }

    public void subirCalificacion(double puntos) {

        this.calificacion = this.calificacion + puntos;

    }

    public void bajarCalificacion(double puntos) {

        this.calificacion = this.calificacion - puntos;

    }

}

/**
 *
 * @author rodri
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        System.out.println(estudiante1.mostrarInfo());

        estudiante1.subirCalificacion(4);

        System.out.println(estudiante1.mostrarInfo());

        estudiante1.bajarCalificacion(2);

        System.out.println(estudiante1.mostrarInfo());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_3;

class Mascota {

    String nombre = "Geko";
    String especie = "Felino";
    int edad = 4;

    public String mostrarInfo() {

        String info = "Nombre: " + this.nombre + " es un " + this.especie + " y tiene " + this.edad + " anios";
        return info;

    }

    public void cumplirAnios(int anios) {

        this.edad = this.edad + anios;

    }

}

public class Ejercicio_2 {

    public static void main(String[] args) {

        Mascota miGato = new Mascota();

        System.out.println(miGato.mostrarInfo());

        miGato.cumplirAnios(2);

        System.out.println(miGato.mostrarInfo());

    }

}

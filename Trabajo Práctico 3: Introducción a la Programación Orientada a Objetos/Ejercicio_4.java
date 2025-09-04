package com.mycompany.tp_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;


    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = (edadInicial >= 0) ? edadInicial : 0;
        this.huevosPuestos = 0; 
    }

    public void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total huevos: " + huevosPuestos);
    }

    public void envejecer() {
        edad += 1;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}

public class Ejercicio_4 {
    public static void main(String[] args) {

        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);

        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();

        System.out.println("\n--- Estado final de las gallinas ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}


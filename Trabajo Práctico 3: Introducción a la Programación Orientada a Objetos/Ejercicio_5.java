/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_3;

class NaveEspacial {

    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial >= 0 && combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = 0;
        }
    }

    public void despegar() {
        if (combustible >= 10) { // supongamos que despegar consume 10 unidades
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible += cantidad;
            if (combustible > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
            }
            System.out.println(nombre + " recargó combustible. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}

public class Ejercicio_5 {

    public static void main(String[] args) {

        NaveEspacial nave1 = new NaveEspacial("Enterprise", 50);

        nave1.mostrarEstado();

        nave1.avanzar(60);

        nave1.recargarCombustible(30);

        nave1.avanzar(60);

        System.out.println("\n--- Estado final de la nave ---");
        nave1.mostrarEstado();
    }
}

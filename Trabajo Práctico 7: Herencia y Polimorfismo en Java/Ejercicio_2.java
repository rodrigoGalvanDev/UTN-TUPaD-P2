/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_7;

/**
 *
 * @author rodri
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        Figura circulo1 = new Circulo("Circulo 1", 3.4);
        Figura rectangulo1 = new Rectangulo("Rectangulo 1", 4.6, 7.2);

        Figura[] figuras = {circulo1, rectangulo1};

        for (Figura figura : figuras) {

            figura.calcularArea();
        }

    }

}

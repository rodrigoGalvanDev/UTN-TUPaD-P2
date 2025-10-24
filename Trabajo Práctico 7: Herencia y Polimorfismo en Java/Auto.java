/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_7;

/**
 *
 * @author rodri
 */
    public class Auto extends Vehiculo {

        protected int cantidadPuertas;

        public Auto(String marca, String modelo, int cantidadPuertas) {
            super(marca, modelo);
            this.cantidadPuertas = cantidadPuertas;
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Marca del Auto: " + marca + " Modelo: " + modelo + " y tiene " + cantidadPuertas + " puertas.");

        }

    }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_5 {

    public class PlacaMadre {

        private String modelo;
        private String chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }

        public String getModelo() {
            return modelo;
        }

        public String getChipset() {
            return chipset;
        }
    }

    public class Propietario {

        private String nombre;
        private String dni;
        private Computadora computadora; // Asociación bidireccional

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setComputadora(Computadora computadora) {
            this.computadora = computadora;
        }

        public Computadora getComputadora() {
            return computadora;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class Computadora {

        private String marca;
        private String numeroSerie;
        private PlacaMadre placa; // Composición
        private Propietario propietario; // Asociación bidireccional

        public Computadora(String marca, String numeroSerie, PlacaMadre placa) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placa = placa;
        }

        public void setPropietario(Propietario propietario) {
            this.propietario = propietario;
            propietario.setComputadora(this);
        }

        public String getMarca() {
            return marca;
        }

        public String getNumeroSerie() {
            return numeroSerie;
        }

        public PlacaMadre getPlaca() {
            return placa;
        }

        public Propietario getPropietario() {
            return propietario;
        }
    }

}

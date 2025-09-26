/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_7 {

    public class Motor {

        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }

        public String getTipo() {
            return tipo;
        }

        public String getNumeroSerie() {
            return numeroSerie;
        }
    }

    public class Conductor {

        private String nombre;
        private String licencia;
        private Vehiculo vehiculo; // Asociación bidireccional

        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getLicencia() {
            return licencia;
        }
    }

    public class Vehiculo {

        private String patente;
        private String modelo;
        private Motor motor;         // Agregación
        private Conductor conductor; // Asociación bidireccional

        public Vehiculo(String patente, String modelo, Motor motor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
        }

        public void setConductor(Conductor conductor) {
            this.conductor = conductor;
            conductor.setVehiculo(this);
        }

        public String getPatente() {
            return patente;
        }

        public String getModelo() {
            return modelo;
        }

        public Motor getMotor() {
            return motor;
        }

        public Conductor getConductor() {
            return conductor;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_2 {

    public class Bateria {

        private String modelo;
        private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }

        public String getModelo() {
            return modelo;
        }

        public int getCapacidad() {
            return capacidad;
        }
    }

    public class Usuario {

        private String nombre;
        private String dni;
        private Celular celular; // Asociación bidireccional

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCelular(Celular celular) {
            this.celular = celular;
        }

        public Celular getCelular() {
            return celular;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class Celular {

        private String imei;
        private String marca;
        private String modelo;
        private Bateria bateria; // Agregación
        private Usuario usuario; // Asociación bidireccional

        public Celular(String imei, String marca, String modelo, Bateria bateria) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
            usuario.setCelular(this);
        }

        public String getImei() {
            return imei;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public Bateria getBateria() {
            return bateria;
        }

        public Usuario getUsuario() {
            return usuario;
        }
    }

}

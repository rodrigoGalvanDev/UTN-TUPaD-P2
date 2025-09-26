/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_6 {

    public class Cliente {

        private String nombre;
        private String telefono;

        public Cliente(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTelefono() {
            return telefono;
        }
    }

    public class Mesa {

        private int numero;
        private int capacidad;

        public Mesa(int numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }

        public int getNumero() {
            return numero;
        }

        public int getCapacidad() {
            return capacidad;
        }
    }

    public class Reserva {

        private String fecha;
        private String hora;
        private Cliente cliente; // Asociación unidireccional
        private Mesa mesa;       // Agregación

        public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
            this.fecha = fecha;
            this.hora = hora;
            this.cliente = cliente;
            this.mesa = mesa;
        }

        public String getFecha() {
            return fecha;
        }

        public String getHora() {
            return hora;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public Mesa getMesa() {
            return mesa;
        }
    }

}

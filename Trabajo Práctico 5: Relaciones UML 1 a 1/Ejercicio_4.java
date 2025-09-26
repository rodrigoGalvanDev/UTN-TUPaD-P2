/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_4 {

    public class Banco {

        private String nombre;
        private String cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCuit() {
            return cuit;
        }
    }

    public class Cliente {

        private String nombre;
        private String dni;
        private TarjetaDeCredito tarjeta; // Asociación bidireccional

        public Cliente(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setTarjeta(TarjetaDeCredito tarjeta) {
            this.tarjeta = tarjeta;
        }

        public TarjetaDeCredito getTarjeta() {
            return tarjeta;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class TarjetaDeCredito {

        private String numero;
        private String fechaVencimiento;
        private Cliente cliente; // Asociación bidireccional
        private Banco banco; // Agregación

        public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.banco = banco;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
            cliente.setTarjeta(this);
        }

        public String getNumero() {
            return numero;
        }

        public String getFechaVencimiento() {
            return fechaVencimiento;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public Banco getBanco() {
            return banco;
        }
    }

}

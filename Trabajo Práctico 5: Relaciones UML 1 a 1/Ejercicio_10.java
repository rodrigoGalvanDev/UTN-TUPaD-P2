/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_10 {

    public class ClaveSeguridad {

        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getUltimaModificacion() {
            return ultimaModificacion;
        }
    }

    public class Titular {

        private String nombre;
        private String dni;
        private CuentaBancaria cuenta;

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCuenta(CuentaBancaria cuenta) {
            this.cuenta = cuenta;
        }

        public CuentaBancaria getCuenta() {
            return cuenta;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class CuentaBancaria {

        private String cbu;
        private double saldo;
        private ClaveSeguridad clave;
        private Titular titular;

        public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.clave = clave;
        }

        public void setTitular(Titular titular) {
            this.titular = titular;
            titular.setCuenta(this);
        }

        public String getCbu() {
            return cbu;
        }

        public double getSaldo() {
            return saldo;
        }

        public ClaveSeguridad getClave() {
            return clave;
        }

        public Titular getTitular() {
            return titular;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_13 {

    public class Usuario {

        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }
    }

    public class CodigoQR {

        private String valor;
        private Usuario usuario;

        public CodigoQR(String valor, Usuario usuario) {
            this.valor = valor;
            this.usuario = usuario;
        }

        public String getValor() {
            return valor;
        }

        public Usuario getUsuario() {
            return usuario;
        }
    }

    public class GeneradorQR {

        public void generar(String valor, Usuario usuario) {
            CodigoQR codigo = new CodigoQR(valor, usuario);
            System.out.println("QR generado para " + usuario.getNombre() + ": " + codigo.getValor());
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_8 {

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

    public class FirmaDigital {

        private String codigoHash;
        private String fecha;
        private Usuario usuario;

        public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }

        public String getCodigoHash() {
            return codigoHash;
        }

        public String getFecha() {
            return fecha;
        }

        public Usuario getUsuario() {
            return usuario;
        }
    }

    public class Documento {

        private String titulo;
        private String contenido;
        private FirmaDigital firma;

        public Documento(String titulo, String contenido, FirmaDigital firma) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firma = firma;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getContenido() {
            return contenido;
        }

        public FirmaDigital getFirma() {
            return firma;
        }
    }

}

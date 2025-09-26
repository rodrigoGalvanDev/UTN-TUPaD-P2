/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_3 {

    public class Autor {

        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }
    }

    public class Editorial {

        private String nombre;
        private String direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }
    }

    public class Libro {

        private String titulo;
        private String isbn;
        private Autor autor; // Asociación unidireccional
        private Editorial editorial; // Agregación

        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getIsbn() {
            return isbn;
        }

        public Autor getAutor() {
            return autor;
        }

        public Editorial getEditorial() {
            return editorial;
        }
    }

}

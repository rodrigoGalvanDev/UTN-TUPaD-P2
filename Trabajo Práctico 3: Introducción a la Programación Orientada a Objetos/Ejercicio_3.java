/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_3;

class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;

        if (añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            this.añoPublicacion = 2000;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int año) {
        if (año > 0) {
            this.añoPublicacion = año;
            System.out.println("Año de publicación actualizado a: " + año);
        } else {
            System.out.println("Valor inválido. No se puede modificar el año.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + añoPublicacion);
    }
}

public class Ejercicio_3 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        libro1.mostrarInfo();

        libro1.setAñoPublicacion(-1999);

        libro1.setAñoPublicacion(1970);

        libro1.mostrarInfo();
    }
}

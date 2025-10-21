/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

/**
 *
 * @author rodri
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro l : libros) {
                l.mostrarInfo();
                System.out.println("---------------------");
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles:");
        for (Libro l : libros) {
            System.out.println("- " + l.getAutor().getNombre());
        }
    }
}

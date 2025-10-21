/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

/**
 *
 * @author rodri
 */
public class BibliotecaLibros {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A01", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A02", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A03", "Julio Cortázar", "Argentino");

        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("L003", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("L004", "Harry Potter y el prisionero de Azkaban", 1999, a2);
        biblioteca.agregarLibro("L005", "El coronel no tiene quien le escriba", 1961, a1);

        System.out.println("\n--- Listado completo de libros ---");
        biblioteca.listarLibros();

        System.out.println("\n--- Buscar libro por ISBN (L003) ---");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("\n--- Filtrar libros publicados en 1997 ---");
        biblioteca.filtrarLibrosPorAnio(1997);

        System.out.println("\n--- Eliminar libro con ISBN L002 ---");
        biblioteca.eliminarLibro("L002");

        System.out.println("\n--- Listado tras eliminación ---");
        biblioteca.listarLibros();

        System.out.println("\n--- Cantidad total de libros ---");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n--- Autores disponibles ---");
        biblioteca.mostrarAutoresDisponibles();
    }

}

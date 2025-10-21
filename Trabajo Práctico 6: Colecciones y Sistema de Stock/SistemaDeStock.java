/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colecciones;

import java.util.ArrayList;

public class SistemaDeStock {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Notebook Lenovo", 2500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Campera Adidas", 1800.0, 5, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P003", "Sillón Reclinable", 3000.0, 2, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("P004", "Manzanas", 800.0, 20, CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("P005", "Televisor Samsung", 2800.0, 8, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("\n--- Listado inicial de productos ---");
        inventario.listarProductos();

        System.out.println("\n--- Buscar producto por ID (P003) ---");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el producto.");
        }

        System.out.println("\n--- Filtrar productos por categoría: ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n--- Eliminar producto con ID P002 ---");
        inventario.eliminarProducto("P002");

        System.out.println("\n--- Listado de productos tras eliminar ---");
        inventario.listarProductos();

        System.out.println("\n--- Actualizar stock del producto P004 a 50 unidades ---");
        inventario.actualizarStock("P004", 50);
        inventario.listarProductos();

        System.out.println("\n--- Total de stock disponible ---");
        System.out.println("Total: " + inventario.obtenerTotalStock() + " unidades.");

        System.out.println("\n--- Producto con mayor stock ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }

        System.out.println("\n--- Filtrar productos con precios entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- Categorías disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}


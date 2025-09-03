/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author rodri
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        
        // a. Declarar e inicializar array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // c. Modificar el precio de un producto específico (ejemplo: índice 2)
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}


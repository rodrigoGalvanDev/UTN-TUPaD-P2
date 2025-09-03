/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author rodri
 */
import java.util.Scanner;

public class Ejercicio_9 {
    
    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costo = 5 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = 10 * peso;
        } else {
            System.out.println("Zona inválida. Se considerará Nacional por defecto.");
            costo = 5 * peso;
        }
        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_4;

/**
 *
 * @author rodri
 */

public class TestEmpleado {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(100, "Ana Pérez", "Analista", 50000);
        Empleado e2 = new Empleado("Juan Gómez", "Desarrollador");
        Empleado e3 = new Empleado("Laura Díaz", "Diseñadora");

        e1.actualizarSalario(10);      // 10% de aumento
        e2.actualizarSalario(5000);    // aumento fijo
        e3.actualizarSalario(5);       // 5% de aumento

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_7;

/**
 *
 * @author rodri
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_3 {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Carlos", 1200, 350));
        empleados.add(new EmpleadoTemporal("Lucía", 80, 15));
        empleados.add(new EmpleadoPlanta("Ana", 1500, 500));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre + "  Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es un empleado de planta.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es un empleado temporal.\n");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_7;

/**
 *
 * @author rodri
 */
public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, double horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

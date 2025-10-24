/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_8;

/**
 *
 * @author rodri
 */
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ValidarEdad {
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        try {
            verificarEdad(25);
            verificarEdad(-4); // dispara la excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}


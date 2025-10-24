/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_8;

/**
 *
 * @author rodri
 */
import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número válido.");
        } finally {
            sc.close();
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un anio");
        int anio = sc.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {

            System.out.println("El año " + anio + " es bisiesto");

        } else {

            System.out.println("El año " + anio + " no es bisiesto");
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }

    }
}

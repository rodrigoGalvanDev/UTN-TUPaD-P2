/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;


/**
 *
 * @author rodri
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " anios");
        
    }
    
}

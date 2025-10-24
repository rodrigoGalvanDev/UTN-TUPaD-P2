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

public class Ejercicio_4 {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Mora"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}

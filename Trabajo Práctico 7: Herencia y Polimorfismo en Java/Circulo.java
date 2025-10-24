/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_7;

/**
 *
 * @author rodri
 */
public class Circulo extends Figura {
    protected  double radio;
    
    
    public Circulo(String nombre, double radio){
    super(nombre);
    this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es de: " + (3.14 * (radio * radio)));
    }
    
}

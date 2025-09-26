/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_12 {

    public class Contribuyente {

        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCuil() {
            return cuil;
        }
    }

    public class Impuesto {

        private double monto;
        private Contribuyente contribuyente;

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }

        public double getMonto() {
            return monto;
        }

        public Contribuyente getContribuyente() {
            return contribuyente;
        }
    }

    public class Calculadora {

        public void calcular(Impuesto impuesto) {
            double total = impuesto.getMonto() * 1.21; // Ejemplo: IVA 21%
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre()
                    + " - Monto final: " + total);
        }
    }

}

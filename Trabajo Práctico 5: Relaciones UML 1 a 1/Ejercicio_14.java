/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_14 {

    public class Proyecto {

        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDuracionMin() {
            return duracionMin;
        }
    }

    public class Render {

        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }

        public String getFormato() {
            return formato;
        }

        public Proyecto getProyecto() {
            return proyecto;
        }
    }

    public class EditorVideo {

        public void exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato, proyecto);
            System.out.println("Proyecto " + proyecto.getNombre()
                    + " exportado en formato: " + render.getFormato());
        }
    }

}

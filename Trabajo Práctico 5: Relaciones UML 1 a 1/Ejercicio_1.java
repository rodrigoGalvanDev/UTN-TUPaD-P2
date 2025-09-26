/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_1 {

    public class Foto {

        private String imagen;
        private String formato;

        public Foto(String imagen, String formato) {
            this.imagen = imagen;
            this.formato = formato;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public String getFormato() {
            return formato;
        }

        public void setFormato(String formato) {
            this.formato = formato;
        }
    }

    public class Titular {

        private String nombre;
        private String dni;
        private Pasaporte pasaporte; // Asociación bidireccional

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setPasaporte(Pasaporte pasaporte) {
            this.pasaporte = pasaporte;
        }

        public Pasaporte getPasaporte() {
            return pasaporte;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class Pasaporte {

        private String numero;
        private String fechaEmision;
        private Foto foto; // Composición
        private Titular titular; // Asociación bidireccional

        public Pasaporte(String numero, String fechaEmision, Foto foto) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = foto;
        }

        public void setTitular(Titular titular) {
            this.titular = titular;
            titular.setPasaporte(this); // bidireccional
        }

        public String getNumero() {
            return numero;
        }

        public String getFechaEmision() {
            return fechaEmision;
        }

        public Foto getFoto() {
            return foto;
        }

        public Titular getTitular() {
            return titular;
        }
    }

}

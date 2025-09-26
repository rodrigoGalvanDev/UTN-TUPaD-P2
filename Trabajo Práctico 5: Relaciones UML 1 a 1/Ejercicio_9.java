/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_5;

/**
 *
 * @author rodri
 */
public class Ejercicio_9 {

    public class Paciente {

        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }

        public String getNombre() {
            return nombre;
        }

        public String getObraSocial() {
            return obraSocial;
        }
    }

    public class Profesional {

        private String nombre;
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEspecialidad() {
            return especialidad;
        }
    }

    public class CitaMedica {

        private String fecha;
        private String hora;
        private Paciente paciente;
        private Profesional profesional;

        public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
            this.fecha = fecha;
            this.hora = hora;
            this.paciente = paciente;
            this.profesional = profesional;
        }

        public String getFecha() {
            return fecha;
        }

        public String getHora() {
            return hora;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public Profesional getProfesional() {
            return profesional;
        }
    }

}

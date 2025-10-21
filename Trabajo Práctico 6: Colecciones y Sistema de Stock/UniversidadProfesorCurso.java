/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

/**
 *
 * @author rodri
 */
public class UniversidadProfesorCurso {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional");

        Profesor p1 = new Profesor("P001", "Laura Gómez", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "Ana López", "Historia");

        Curso c1 = new Curso("C001", "Álgebra I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Historia Universal");
        Curso c4 = new Curso("C004", "Cálculo");
        Curso c5 = new Curso("C005", "Bases de Datos");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C004", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C005", "P002");
        uni.asignarProfesorACurso("C003", "P003");

        System.out.println("\n--- Listado de cursos con sus profesores ---");
        uni.listarCursos();

        System.out.println("\n--- Listado de profesores con sus cursos ---");
        uni.listarProfesores();

        System.out.println("\n--- Cambiar el profesor del curso C001 a Carlos Pérez ---");
        uni.asignarProfesorACurso("C001", "P002");

        System.out.println("\n--- Eliminar curso C004 ---");
        uni.eliminarCurso("C004");

        System.out.println("\n--- Eliminar profesor P003 ---");
        uni.eliminarProfesor("P003");

        System.out.println("\n--- Reporte de cantidad de cursos por profesor ---");
        uni.reporteCantidadCursosPorProfesor();
    }
}

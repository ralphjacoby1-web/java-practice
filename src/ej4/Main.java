package ej4;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Curso c = new Curso();

        c.agregarAlumnos(new Alumno("Maxi",9.8));
        c.agregarAlumnos(new Alumno("Fran",6.2));
        c.agregarAlumnos(new Alumno("Camilo",3.6));
        c.agregarAlumnos(new Alumno("Santi",1.4));

        c.mostrarAlumnos();

        c.mostrarAprobados();

        System.out.println(c.buscarAlumno("Maxi").getNombre()  + " - " + c.buscarAlumno("Maxi").getNota());

    }
}

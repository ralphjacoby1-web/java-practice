package ej4;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Alumno> listaAlumnos;

    public Curso(){
        this.nombre = nombre;
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumnos(Alumno a){
        listaAlumnos.add(a);
    }

    public void mostrarAlumnos(){
        for (int i = 0; i < listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i).getNombre() + " - " + listaAlumnos.get(i).getNota());
        }
    }

    public void mostrarAprobados(){
        for (int i = 0; i < listaAlumnos.size(); i++){
            if (listaAlumnos.get(i).estaAprobado()) {
                System.out.println(listaAlumnos.get(i).getNombre() + " - " + listaAlumnos.get(i).getNota());
            }
        }
    }

    public ArrayList<Alumno> getListaAlumnos(){
        return this.listaAlumnos;
    }

    public Alumno buscarAlumno(String nombre){
        for (int i = 0; i < listaAlumnos.size(); i++){
            if (listaAlumnos.get(i).getNombre().equals(nombre)){
                return listaAlumnos.get(i);
            }
        }
        return null;
    }

}

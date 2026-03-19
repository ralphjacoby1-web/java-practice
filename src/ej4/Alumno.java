package ej4;

public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    String getNombre(){
        return this.nombre;
    }

    double getNota(){
        return this.nota;
    }

    public boolean estaAprobado(){
        return this.nota >= 6;
    }
}

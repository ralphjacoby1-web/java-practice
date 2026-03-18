package ej2;

public class Estudiante {
    String nombre;
    double[] notas;

    public Estudiante(String nombre, double[] notas){
        this.nombre = nombre;
        this.notas = notas;
    }

    public void  calcularPromedio(){
        double acum = 0;
        for (double n : notas){
            acum += n;
        }
        System.out.println("El promedio de notas es" + acum / notas.length);
    }

    public  void mostrarNotas(){
        for (double n : notas){
            System.out.println(n);
        }
    }
}

package ej2;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre,int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("Hola me llamo " + nombre  + " y tengo " + edad + " anios");
    }
}

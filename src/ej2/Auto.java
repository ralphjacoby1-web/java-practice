package ej2;

public class Auto {
    int velocidad = 0;
    String marca;
    String modelo;

    public Auto(String marca, String modelo){
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        velocidad = 100;
    }

    public void frenar(){
        velocidad = 0;
    }

    public void mostrarVelocidad(){
        System.out.println(velocidad + "km/h");
    }
}

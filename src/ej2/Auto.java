package ej2;

public class Auto {
    private int velocidad = 0;
    String marca;
    String modelo;

    public Auto(String marca, String modelo){
        this.velocidad = 0;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int cantidad) {
        if (cantidad < 0)return;
        velocidad += cantidad;
    }


    public void frenar(int cantidad){
        if (cantidad > velocidad){
            velocidad = 0;
        }else {
            velocidad -= cantidad;
        }
    }

    public void mostrarVelocidad(){
        System.out.println(velocidad + "km/h");
    }
}

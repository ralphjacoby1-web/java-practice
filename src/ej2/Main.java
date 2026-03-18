package ej2;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Ralph", 19);
        Persona p2 = new Persona("Lionel", 21);
        p2.mostrarNombre();

        Auto a1 = new Auto("Ford","Mondeo");
        a1.acelerar();
        a1.mostrarVelocidad();
        a1.frenar();
        a1.mostrarVelocidad();


        Libro l1 = new Libro("Mil 11", "Ralph");
        System.out.println(l1.prestado);
        l1.prestar();
        System.out.println(l1.prestado);
        l1.devolver();
        System.out.println(l1.prestado);

        CuentaBancaria c1 = new CuentaBancaria("Ralph", 1000.0);
        c1.mostrarSaldo();
        c1.depositar();
        c1.mostrarSaldo();
        c1.retirar();
        c1.mostrarSaldo();


        Estudiante e1 = new Estudiante("Maxi", new double[]{10.0,2.5,1.0,4.5,9.5});
        e1.calcularPromedio();
        e1.mostrarNotas();





    }
}

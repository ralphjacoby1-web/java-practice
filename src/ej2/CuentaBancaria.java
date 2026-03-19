package ej2;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(){
        double cantidad = ingresarDouble("Ingrese la cantidad para depositar: ");
        if (cantidad <= 0){
            System.out.println("No se puede ingresar un valor menor o igual a 0.");
        }else{
            System.out.println("Listo.");
            saldo += cantidad;
        }
    }

    public void retirar(){
        double cantidad = ingresarDouble("Ingrese la cantidad que desea retirar.");
        if (cantidad <= 0 || cantidad > saldo){
            System.out.println("No se puede ingresar un valor menor o igual a 0.");
        }else {
            System.out.println("Listo.");
            saldo -= cantidad;
        }
    }

    public void mostrarSaldo(){
        System.out.println("El saldo actual es de: " + saldo);
    }

    private double ingresarDouble(String msg){//el main le pasa los datos. mal
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double n = sc.nextDouble();
        return n;
    }
}

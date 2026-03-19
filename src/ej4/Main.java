package ej4;
import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        ArrayList<Alumno> =
        Alumno a1 = new Alumno("Maxi", 5.5);
        System.out.println(a1.getNota() + " " + a1.getNombre());
        if (a1.estaAprobado()){
            System.out.println("Esta aprobado");
        }else {
            System.out.println("No esta aprobado");
        }
    }
}

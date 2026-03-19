package ej3;

import java.util.Scanner;

public class Direccion {

    int x;
    int y;

    public String dir(){
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();
        return dir;
    }

    public boolean derecha(String dir){
        return dir.equals("d");
    }

    public boolean izquierda(String dir){
        return dir.equals("a");
    }

    public boolean arriba(String dir){
        return dir.equals("w");
    }

    public boolean abajo(String dir){
        return dir.equals("s");
    }

}

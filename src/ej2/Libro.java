package ej2;

public class Libro {
    String titulo;
    String autor;
    boolean prestado = false;


    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }

    public void prestar(){
        prestado = true;
    }

    public void devolver(){
        prestado = false;
    }




}

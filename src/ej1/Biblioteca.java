package ej1;

import java.time.LocalDate;
import java.util.ArrayList;


public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(){
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }


    public void agregarLibros(String titulo, int isbn){
        if (validarExsitenciaIsbn(isbn)){
            System.out.println("El libro con el ISBN: " + isbn + " ya existe.");
        }else{
            libros.add(new Libro(titulo,isbn,"disponible"));
        }
    }


    public boolean prestarLibros(int isbn, String nombre){
        for (Libro l : libros){
            if (isbn == l.isbn && l.estado.equals("disponible")){
                l.estado = "prestado";
                prestamos.add(new Prestamo(nombre, LocalDate.now(),null, isbn));
                return true;
            }
        }
        return false;
    }


    public void devolverLibro(int isbn){
        for (Prestamo n : prestamos){
            if (isbn == n.isbn){
                n.fechaDev = LocalDate.now();
                for (Libro l : libros){
                    if (isbn == l.isbn){
                        l.estado = "disponible";
                    }
                }
                break;
            }
        }
    }


    public void listarLibrosPrestados(){
        if (!prestamos.isEmpty()) {
            for (Libro n : libros) {
                if (!n.estado.equals("disponible")) {
                    System.out.println("- " + n.titulo + " | " + "ISBN: " + n.isbn + "\n");
                    for (Prestamo p : prestamos) {
                        if (p.isbn == n.isbn) {
                            System.out.println("Prestado: " + p.prestadoA + " | Prestado el " + p.fechaPres);
                        }
                    }
                }
            }
        }else {
            System.out.println("No hay libros prestados aun.");
        }

    }


    public void listarLibrosDisponibles(){
        boolean encontrado = false;
        for (Libro n : libros){
            if (n.estado.equals("disponible")) {
                encontrado = true;
                System.out.println("- " + n.titulo + " | "+ "ISBN: " + n.isbn);
            }
        }
        if (!encontrado){
            System.out.println("No hay libros disponibles.");
        }
    }


    public void listarLibros(){
        for (Libro n : libros){
            System.out.println("- " + n.isbn);
        }
    }


    public void consultarDisponibilidad(int isbn){
        boolean encontrado = false;
        for (Libro n : libros){
            if (isbn == n.isbn){
                encontrado = true;
                System.out.println("El libro que desea esta " + n.estado);
            }
        }
        if (!encontrado){
            System.out.println("No hay un libro con ese ISBN.");
        }
    }

    public boolean estaVacia(){
        return libros.isEmpty();
    }

    private boolean validarExsitenciaIsbn(int isbn){
        for (Libro l : libros){
            if (l.isbn == isbn){
                return true;
            }
        }
        return false;
    }

}



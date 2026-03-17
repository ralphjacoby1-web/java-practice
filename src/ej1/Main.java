package ej1;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        if (bib.estaVacia()){
            System.out.println("No hay libros en la biblioteca todavia.");
            String titulo = ingresarString("el titulo");
            int isbn = ingresarIsbn();
            bib.agregarLibros(titulo,isbn);
        }
        while (true) {
            opt();
            System.out.print("Ingrese una opcion: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    int isbn = ingresarIsbn();
                    String titulo = ingresarString("el titulo");
                    bib.agregarLibros(titulo, isbn);
                    break;
                case 2:
                    isbn = ingresarIsbn();
                    String nombre = ingresarString("el nombre");
                    if (bib.prestarLibros(isbn, nombre)){
                        System.out.println("Listo.");
                    }else{
                        System.out.println("El isbn ingresado no es correcto o no esta disponible.");
                    };
                    break;
                case 3:
                    isbn = ingresarIsbn();
                    bib.devolverLibro(isbn);
                    break;
                case 4:
                    isbn = ingresarIsbn();
                    bib.consultarDisponibilidad(isbn);
                    break;
                case 5:
                    bib.listarLibrosDisponibles();
                    break;
                case 6:
                    bib.listarLibrosPrestados();
                    break;
                case 0:
                    System.out.println("Saliedo...");
                    return;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }


    public static void opt(){
        System.out.println("""
                1- Agregar libro
                2- Prestar libro
                3- Devolver libro
                4- Consultar disponibilidad
                5- Listar libros disponibles 
                6- Listar libros prestados""");
    }


    public static boolean validarRangos(int min, int max, int valor){
        return min <= valor && max >= valor;
    }


    public static int ingresarIsbn(){
        System.out.print("Ingrese el ISBN del libro: ");
        int isbn = sc.nextInt();
        sc.nextLine();
        while (true){
            if (!validarRangos(1000, 9999, isbn)){
                System.out.print("Error, ingrese el ISBN del libro nuevamente: ");
                isbn = sc.nextInt();
                sc.nextLine();
            }else {
                break;
            }
        }
        return isbn;

    }


    public static String ingresarString(String msg){
        System.out.print("Ingrese " + msg + ": ");
        String str = sc.nextLine();
        return str;
    }
}

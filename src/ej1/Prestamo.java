package ej1;

import java.time.LocalDate;

public class Prestamo {
    String prestadoA;
    LocalDate  fechaPres;
    LocalDate fechaDev;
    int isbn;

    public Prestamo(String prestadoA, LocalDate fechaPres, LocalDate fechaDev,int isbn) {
        this.prestadoA = prestadoA;
        this.fechaPres = fechaPres;
        this.fechaDev = fechaDev;
        this.isbn = isbn;
    }
}

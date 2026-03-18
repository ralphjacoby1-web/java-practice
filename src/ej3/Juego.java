package ej3;

public class Juego {
    int filas = 20;
    int columnas = 20;
    public void tablero(int x,int y){
        while (true) {
            y++;
            x++;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (x == j && y == i) {
                        System.out.print("0");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\n\n\n\n");
        }

    }

}

package ej3;

public class Juego {
    int filas = 20;
    int columnas = 20;
    public void tablero(){
        Snake s = new Snake();
        Direccion d = new Direccion();
        int x = s.posicionX;
        int y = s.posicionY;
        while (true) {
            String dir = d.dir();
            if (d.derecha(dir)){
                x++;
            }else if (d.izquierda(dir)){
                x--;
            }else if (d.arriba(dir)){
                y--;
            }else{
                y++;
            }
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

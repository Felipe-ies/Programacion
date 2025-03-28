/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatallaNaval;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Tablero {

    private char[][] matriz;
    private ArrayList<Barco> listaBarcos;

    /*
     Los barcos tienen diferentes tamaños:
         Portaviones (5 celdas)
         Acorazado (4 celdas)
         Crucero (3 celdas)
         Submarino (3 celdas)
         Destructor (2 celdas)
    
    Tablero → _(defautl), B(barco propio); Oponente: A(agua),T(tocado)→ H(hundido).
     */
    public Tablero() {
        this.matriz = new char[10][10];
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                this.matriz[i][j] = '_';
            }
        }
        this.listaBarcos = new ArrayList<>(5);
    }

    public ArrayList<Barco> getListaBarcos() {
        return this.listaBarcos;
    }

    /**
     * Añade un barco al tablero.
     *
     * @param barco
     * @param x Coordenada x inicial
     * @param y Coordenada y inicial
     * @param direccion (arriba, abajo, izquierda, derecha)
     * @return
     */
    public boolean colocarBarco(Barco barco, int x, int y, String direccion) {
        int tamañoBarco = barco.getTamaño();
        ArrayList<int[]> coordBarco = new ArrayList<>();

        // Verificar si el barco cabe en la dirección seleccionada
        boolean cabeEnTablero
                = ("arriba".equals(direccion.toLowerCase()) && (y - tamañoBarco + 1 >= 0))
                || ("abajo".equals(direccion.toLowerCase()) && (y + tamañoBarco - 1 < this.matriz.length))
                || ("izquierda".equals(direccion.toLowerCase()) && (x - tamañoBarco + 1 >= 0))
                || ("derecha".equals(direccion.toLowerCase()) && (x + tamañoBarco - 1 < this.matriz[0].length));

        if (!cabeEnTablero) {
            System.out.println("El barco no cabe en esa posición.");
            return false;
        }

        // Verificar si las posiciones están disponibles
        boolean posicionValida = true;
        for (int i = 0; i < tamañoBarco; i++) {
            int newX = x;
            int newY = y;

            if ("arriba".equals(direccion.toLowerCase())) {
                newY -= i;
            } else if ("abajo".equals(direccion.toLowerCase())) {
                newY += i;
            } else if ("izquierda".equals(direccion.toLowerCase())) {
                newX -= i;
            } else if ("derecha".equals(direccion.toLowerCase())) {
                newX += i;
            }

            if (this.matriz[newY][newX] != '_') {
                System.out.println("Posición ocupada. No se puede colocar el barco.");
                posicionValida = false;
            }

            // Guardamos la coordenada temporalmente
            coordBarco.add(new int[]{newX, newY});
        }

        // Si alguna posición no era válida, salimos sin colocar el barco
        if (!posicionValida) {
            return false;
        }

        // Si todas las posiciones están libres, colocamos el barco
        for (int[] coord : coordBarco) {
            this.matriz[coord[1]][coord[0]] = 'B';
        }

        barco.setCoordenadas(coordBarco);
        this.listaBarcos.add(barco);

        System.out.println(barco.getNombre() + " colocado correctamente.");
        return true;
    }

    /**
     * Comprueba si hay un barco en la coordenada.
     *
     * @param x
     * @param y
     */
    public boolean recibirDisparo(int x, int y) {
        for (Barco barco : this.listaBarcos) {
            if (barco.recibirDisparo(x, y)) {
                this.matriz[y][x] = 'T'; // Marcar como tocado
                return true;
            }
        }
        if(this.matriz[y][x] == 'T' || this.matriz[y][x] == 'H'){
            System.out.println("Ya has disparado a esa posición.");
            return false;
        }
        this.matriz[y][x] = 'A'; // Marcar como agua
        return false;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    /**
     * Imprime el tablero, ocultando los barcos enemigos.
     */
    public void mostrarTablero(boolean ocultarBarcos) {
        System.out.println("   0  1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < this.matriz.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < this.matriz[i].length; j++) {
                if(ocultarBarcos && this.matriz[i][j] == 'B'){
                    System.out.print(" _ ");
                }else {
                    System.out.print(" " + this.matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}

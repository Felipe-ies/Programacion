/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatallaNaval;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Jugador {

    private String nombre;
    private Tablero tablero;
    private Tablero tableroOponente;
    private Barco[] flota;
    static Scanner teclado = new Scanner(System.in);

    public Jugador() {
        this.tablero = new Tablero();
        this.tableroOponente = new Tablero();
        this.flota = new Barco[]{
            new Barco("Portaviones", 5),
            new Barco("Acorazado", 4),
            new Barco("Crucero", 3),
            new Barco("Submarino", 3),
            new Barco("Destructor", 2),};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Barco[] getFlota() {
        return flota;
    }

    /**
     * Permite al jugador posicionar todos sus barcos.
     */
    public void colocarFlota() {
        for (Barco barco : this.flota) {
            boolean colocado = false;
            this.tablero.mostrarTablero(false);
            while (!colocado) {
                int[] coordenadas = validarCoordenadas();
                int x = coordenadas[0];
                int y = coordenadas[1];
                teclado.nextLine(); // Limpiar scanner
                String direccion = validarDireccion();
                colocado = this.tablero.colocarBarco(barco, x, y, direccion);
                if (!colocado) {
                    System.out.println("Error al colocar el barco. Inténtalo de nuevo.");
                }
            }
        }
        System.out.println("Flota colocada correctamente.");
        this.tablero.mostrarTablero(false);
    }

    public int[] validarCoordenadas(){
        int[] coordenadas = new int[2];
        boolean validado = false;
        while(!validado){
            System.out.print("Ingresa coordenada x: ");
            int x = teclado.nextInt();
            System.out.print("Ingresa coordenada y: ");
            int y = teclado.nextInt();
            if(x >= 0 && x <= 9 && y >= 0 && y <= 9){
                coordenadas[0] = x;
                coordenadas[1] = y;
                validado = true;
            }else{
                System.out.println("Coordenadas incorrectas. Inténtalo de nuevo.");
            }
        }
        return coordenadas;
    }

    public String validarDireccion(){
        String direccion = "";
        boolean validado = false;
        while(!validado){
            System.out.println("Ingresa direccion:(arriba, abajo, izquierda, derecha)");
            direccion = teclado.nextLine();
            if("arriba".equals(direccion) || "abajo".equals(direccion) || "izquierda".equals(direccion) || "derecha".equals(direccion)){
                validado = true;
            }else{
                System.out.println("Dirección incorrecta. Inténtalo de nuevo.");
            }
        }
        return direccion;
    }

    /**
     * Ataca una coordenada del tablero enemigo. Tablero: _(defautl), B(barco
     * propio), A(agua), T(tocado), H(hundido).
     *
     * @param enemigo
     * @param x
     * @param y
     */
    public void realizarDisparo(Jugador enemigo, int x, int y) {
        if (enemigo.tablero.recibirDisparo(x, y)) {
            this.tableroOponente.getMatriz()[y][x] = 'T';
        } else {
            this.tableroOponente.getMatriz()[y][x] = 'A';
        }
        for (Barco b : enemigo.getFlota()) {
            for (int[] coord : b.getCoordenadas()) {
                if (coord[0] == x && coord[1] == y) {
                    b.recibirDisparo(x, y);
                }
            }
        }
    }
}

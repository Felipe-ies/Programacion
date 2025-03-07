/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cagnaespindolafelipe.pkg2ºevaluación;

/**
 *
 * @author dam
 */
import java.util.Random;
import java.util.Arrays;

public class Juego {

    private char[][] mapa = new char[5][5];
    private int jugadorX;
    private int jugadorY;
    private int tesorosRestantes;

    //B=Bosque, P=Playa, M=Montaña, T=Tesoro, O=Oceano
    private char[] terreno = {'B', 'P', 'M', 'T', 'O'};

    
    /*Los constructores son métodos que crean una instancia de la clase, o mejor
    dicho, crean un objeto nuevo, y inician o cambian los atributos de la clase
    y así cáda objeto tiene sus propios atributos.
    */
    public Juego(char[][] mapa) {
        this.mapa = mapa;
        this.jugadorX = 0;
        this.jugadorY = 0;
    }

    public Juego() {
        this.mapa = mapa;
        this.jugadorX = 0;
        this.jugadorY = 0;
    }

    /*
    Los métodos getter y setter se introducen para crear una interfaz con la que 
    poder interactuar con el objeto y obtener o modificar los atributos, ya que
    están seteados a "private", encapsulados para proteger el código de errores
    */
    //Métodos Getter para devolver los atributos del mapa
    public char[][] getMapa() {
        return mapa;
    }

    public int getJugadorX() {
        return jugadorX;
    }

    public int getJugadorY() {
        return jugadorY;
    }

    public int getTesorosRestantes() {
        return tesorosRestantes;
    }

    //Metodos Setter para modificar los atributos del mapa
    public void setMapa(char[][] mapa) {
        this.mapa = mapa;
    }

    public void setJugadorX(int jugadorX) {
        this.jugadorX = jugadorX;
    }

    public void setJugadorY(int jugadorY) {
        this.jugadorY = jugadorY;
    }

    public void setTesorosRestantes(int tesorosRestantes) {
        this.tesorosRestantes = tesorosRestantes;
    }
    
    //Otros métodos
    public void mostrarMapa() {
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                if (this.jugadorX == j && this.jugadorY == i) {
                    System.out.print('J' + "  ");
                } else {
                    System.out.print(this.mapa[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }

    public boolean moverJugador(String direccion) {
        boolean movimiento = false;
        if (direccion.equalsIgnoreCase("arriba") && this.jugadorY > 0) {
            this.jugadorY -= 1;
            movimiento = true;
        }
        if (direccion.equalsIgnoreCase("abajo") && this.jugadorY < this.mapa.length -1) {
            this.jugadorY += 1;
            movimiento = true;
        }
        if (direccion.equalsIgnoreCase("izquierda") && this.jugadorX > 0) {
            this.jugadorX -= 1;
            movimiento = true;
        }
        if (direccion.equalsIgnoreCase("derecha") && this.jugadorX < this.mapa.length -1) {
            this.jugadorX += 1;
            movimiento = true;
        }
        if (this.mapa[this.jugadorY][this.jugadorX] == 'T') {
            this.mapa[this.jugadorY][this.jugadorX] = 'X';
            this.tesorosRestantes--;
        }
        return movimiento;
    }

    public boolean procesarMovimientos(String listaMovimientos) {
        String[] movimientos = listaMovimientos.split((" "));
        boolean movimiento = true;
        for (int i = 0; i < movimientos.length; i++) {
            boolean mueve = moverJugador(movimientos[i].toLowerCase());
            if (!mueve) {
                movimiento = false;
            }
        }
        return movimiento;
    }

    public void inicializarMapa() {
        Random rd = new Random();
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                int random = rd.nextInt(0, this.terreno.length);
                this.mapa[i][j] = this.terreno[random];
            }
        }
    }

    public int contarTesoros() {
        int cantTesoros = 0;
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                if (this.mapa[i][j] == 'T') {
                    cantTesoros ++;
                }
            }
        }
        this.tesorosRestantes = cantTesoros;
        return this.tesorosRestantes;
    }

    
    /*El método toString, es un método que devuelve una cadena y que explica o
    muestra como está creado el objeto, nombrando y mostrando sus atributos.
    Es un método que utiliza @Override, ya que es un metodo built in de Java
    para las clases y objetos.
    */
    @Override
    public String toString() {
        String mapaStr = "";
        for(int i=0; i<this.mapa.length; i++){
            mapaStr.concat(Arrays.toString(mapa[i]));
        }
        return "Juego{" + "mapa= array 5 x 5" + ", jugadorX=" +
                jugadorX + ", jugadorY=" + jugadorY + ", tesorosRestantes=" +
                tesorosRestantes;
    }
    
}

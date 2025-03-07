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
public class Barco {
    private String nombre;
    private int tamaño;
    private ArrayList<int[]> coordenadas;
    private int golpesRecibidos;
    private boolean hundido;
    private ArrayList<int[]> coordGolpeadas;

    public Barco(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.coordenadas = new ArrayList<>(tamaño);
        this.golpesRecibidos = 0;
        this.hundido = false;
        this.coordGolpeadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setCoordenadas(ArrayList<int[]> coordenadas){
        this.coordenadas = coordenadas;
    }

    public ArrayList<int[]> getCoordenadas(){
        return this.coordenadas;
    }

    public int getGolpesRecibidos() {
        return golpesRecibidos;
    }

    public void setGolpesRecibidos(int golpesRecibidos) {
        this.golpesRecibidos = golpesRecibidos;
    }

    public boolean estaHundido(){
        this.hundido = this.golpesRecibidos == this.tamaño;
        return this.hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }
    
    /**
     * Registra un impacto si la coordenada coincide
     * con la posición del barco
     * @param x
     * @param y 
     * @return  
     */
    public boolean recibirDisparo(int x, int y) {
        boolean yaGolpeado = false;
        for (int[] golpe : this.coordGolpeadas) {
            if (golpe[0] == x && golpe[1] == y) {
                yaGolpeado = true;
            }
        }
        if (!yaGolpeado) {
            for (int[] i : this.coordenadas) {
                if (i[0] == x && i[1] == y) {
                    this.coordGolpeadas.add(new int[]{x, y});
                    this.golpesRecibidos++;
                    if (this.golpesRecibidos == this.tamaño) {
                        this.hundido = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

}

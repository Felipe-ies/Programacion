/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDado;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Felipe
 */
public class Dado {

    private String nombre;
    private int[] tiradas;

    public Dado(String nombre, int tiradas) {
        this.nombre = nombre;
        Random rd = new Random();
        if (tiradas <= 0) {
            this.tiradas = new int[1];
        } else {
            this.tiradas = new int[tiradas];
        }
        for (int i = 0; i < this.tiradas.length; i++) {
            this.tiradas[i] = rd.nextInt(1, 7);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTiradas() {
        return tiradas;
    }

    public void setTiradas(int[] tiradas) {
        this.tiradas = tiradas;
    }

    @Override
    public String toString() {
        return "Dado{" + "nombre=" + this.nombre +
                ", tiradas=" + Arrays.toString(this.tiradas) + '}';
    }
}

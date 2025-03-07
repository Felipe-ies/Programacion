/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.utilizacionavanzadaclases;

import java.awt.Color;
import java.time.LocalDate;

/**
 *
 * @author dam
 */
public class Avion extends Vehiculo {

    private int nPasajeros;

    public Avion(int nPasajeros, Color color, String marca, String modelo) {
        super(marca, color, modelo);
        this.nPasajeros = nPasajeros;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    @Override
    public String toString() {
        return "Avion{" + "nPasajeros=" + nPasajeros + '}';
    }
    
    @Override
        public void imprimirTipo(){
        System.out.println("Soy un vehiculo");
    }

}

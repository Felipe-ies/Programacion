/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtraterrestre;

/**
 *
 * @author dam
 */
public abstract class Extraterrestre {
    String nombre;
    int numeroPiernas;
    int numeroCabezas;
    int numeroOjos;
    String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPiernas() {
        return numeroPiernas;
    }

    public void setNumeroPiernas(int numeroPiernas) {
        this.numeroPiernas = numeroPiernas;
    }

    public int getNumeroCabezas() {
        return numeroCabezas;
    }

    public void setNumeroCabezas(int numeroCabezas) {
        this.numeroCabezas = numeroCabezas;
    }

    public int getNumeroOjos() {
        return numeroOjos;
    }

    public void setNumeroOjos(int numeroOjos) {
        this.numeroOjos = numeroOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Extraterrestres{" + "nombre=" + nombre + ", numeroPiernas=" + numeroPiernas + ", numeroCabezas=" + numeroCabezas + ", numeroOjos=" + numeroOjos + ", color=" + color + '}';
    }
    
}

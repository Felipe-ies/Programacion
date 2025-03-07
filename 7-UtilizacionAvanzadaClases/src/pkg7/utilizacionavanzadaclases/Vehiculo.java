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
public abstract class Vehiculo {

    private String marca;
    private Color color;
    private String modelo;
    private LocalDate fechaMatriculacion;

    public Vehiculo(String marca, Color color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.fechaMatriculacion = LocalDate.now();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", fecha=" + fechaMatriculacion + '}';
    }
    
    //Devuelve la antiguedad en años
    public int calcularAntiguedad(){
        int añoActual = LocalDate.now().getYear();
        int añoMatriculacion = fechaMatriculacion.getYear();
        return añoActual - añoMatriculacion;
    }
    
    public abstract void imprimirTipo();

}

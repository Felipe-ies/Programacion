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
public class Coche extends Vehiculo {

    private String matricula;

    public Coche(String matricula, Color color, String marca, String modelo) {
        super(marca, color, modelo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + super.toString() + '}';
    }
    
    @Override
        public void imprimirTipo(){
        System.out.println("Soy un vehiculo");
    }

}

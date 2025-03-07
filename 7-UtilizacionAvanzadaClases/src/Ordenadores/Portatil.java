/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenadores;

/**
 *
 * @author dam
 */
public class Portatil extends Ordenador {

    private boolean touchPad;
    private int autonomia; //En horas

    public Portatil(boolean touchPad, int autonomia, String sistemaOperativo, int memoriaRam, String microprocesador, int discoDuro) {
        super(sistemaOperativo, memoriaRam, microprocesador, discoDuro);
        this.touchPad = touchPad;
        this.autonomia = autonomia;
    }

    public boolean isTouchPad() {
        return touchPad;
    }

    public void setTouchPad(boolean touchPad) {
        this.touchPad = touchPad;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Portatil{" + "touchPad=" + touchPad + ", autonomia=" + autonomia + super.toString() + '}';
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Portatil");
    }
}

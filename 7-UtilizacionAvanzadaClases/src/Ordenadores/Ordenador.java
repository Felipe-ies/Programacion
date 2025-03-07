/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenadores;

/**
 *
 * @author dam
 */
public abstract class Ordenador {
    private String sistemaOperativo;
    private int memoriaRam;
    private String microprocesador;
    private int discoDuro;

    public Ordenador(String sistemaOperativo, int memoriaRam, String microprocesador, int discoDuro) {
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam = memoriaRam;
        this.microprocesador = microprocesador;
        this.discoDuro = discoDuro;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "sistemaOperativo=" + sistemaOperativo + ", memoriaRam=" + memoriaRam + ", microprocesador=" + microprocesador + ", discoDuro=" + discoDuro + '}';
    }
    
    public abstract void imprimirTipo();
}

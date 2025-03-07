/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenadores;

/**
 *
 * @author dam
 */
public class PC extends Ordenador {

    private String factorForma;

    public PC(String factorForma, String sistemaOperativo, int memoriaRam, String microprocesador, int discoDuro) {
        super(sistemaOperativo, memoriaRam, microprocesador, discoDuro);
        this.factorForma = factorForma;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    @Override
    public String toString() {
        return "PC{" + "factorForma=" + factorForma + super.toString() + '}';
    }

    @Override
    public void imprimirTipo() {
        System.out.println("PC");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRol;

/**
 *
 * @author dam
 */
public class Hechizo {
    private String tipo;
    private int potencia;

    public Hechizo() {
        this.tipo = "fuego";
        this.potencia = 11;
    }

    public Hechizo(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo; 
    }
    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    public int getPotencia() {
        return potencia; 
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Hechizo{" + "tipo='" + tipo + "', potencia=" + potencia + '}';
    }
}


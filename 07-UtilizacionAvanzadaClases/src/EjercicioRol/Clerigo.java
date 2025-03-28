/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRol;

/**
 *
 * @author dam
 */
public class Clerigo extends Personaje {
    private final static int F_MENOR = 8;
    private final static int I_MENOR = 10;
    private final static int I_MAYOR = 20;
    private String dios;

    public Clerigo(String nombre, String raza, int fuerza, int inteligencia, int pvMax, int pvActual, String dios) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, pvMax, pvActual);
        if (fuerza < F_MENOR || inteligencia < I_MENOR || inteligencia > I_MAYOR) {
            throw new PersonajeException("Restricciones de Clérigo no cumplidas");
        }
        this.dios = dios;
    }

    public void curar(Personaje p) {
        p.pvActual += 11;
        if (p.pvActual > p.pvMax) p.pvActual = p.pvMax;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dios: " + dios;
    }
}


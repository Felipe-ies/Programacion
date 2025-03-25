/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRol;

/**
 *
 * @author dam
 */
public class Personaje implements Rol {
    protected String nombre;
    protected String raza;
    protected int fuerza;
    protected int inteligencia;
    protected int pvMax;
    protected int pvActual;

    protected final static int F_MAX = 20;
    protected final static int I_MAX = 25;
    protected final static int P_V_MAX = 500;

    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int pvMax, int pvActual) throws PersonajeException {
        if (!raza.equals("humano") && !raza.equals("elfo") && !raza.equals("enano") && !raza.equals("gnomo")) {
            throw new PersonajeException("Raza inválida");
        }
        if (fuerza < 0 || fuerza > F_MAX || inteligencia < 0 || inteligencia > I_MAX || pvMax < 0 || pvMax > P_V_MAX || pvActual < 0 || pvActual > pvMax) {
            throw new PersonajeException("Valores de atributos fuera de rango");
        }
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.pvMax = pvMax;
        this.pvActual = pvActual;
    }

    @Override
    public int calcularPoder() {
        return fuerza * inteligencia + pvActual;
    }

    @Override
    public String toString() {
        return nombre + " (" + raza + ") - Fuerza: " + fuerza + ", Inteligencia: " + inteligencia +
                ", PV: " + pvActual + "/" + pvMax + ", Poder: " + calcularPoder();
    }
}

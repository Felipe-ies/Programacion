/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRol;

/**
 *
 * @author dam
 */
import java.util.ArrayList;

public class Mago extends Personaje {
    private final static int I_MENOR = 15;
    private final static int F_MAYOR = 10;
    private final static int N_HECHIZOS = 5;
    private ArrayList<Hechizo> hechizos;

    public Mago(String nombre, String raza, int fuerza, int inteligencia, int pvMax, int pvActual) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, pvMax, pvActual);
        if (inteligencia < I_MENOR || fuerza > F_MAYOR) {
            throw new PersonajeException("Restricciones de Mago no cumplidas");
        }
        hechizos = new ArrayList<>();
    }

    public void aprendeHechizo(Hechizo h) throws PersonajeException {
        if (hechizos.size() >= N_HECHIZOS) throw new PersonajeException("Máximo de hechizos alcanzado");
        hechizos.add(h);
    }

    public void lanzaHechizo(Personaje p, String tipoHechizo) throws PersonajeException {
        Hechizo hechizoLanzado = null;
        for (Hechizo h : hechizos) {
            if (h.getTipo().equalsIgnoreCase(tipoHechizo)) {
                hechizoLanzado = h;
                break;
            }
        }
        if (hechizoLanzado == null) throw new PersonajeException("No se encontró el hechizo");
        p.pvActual -= hechizoLanzado.getPotencia();
        if (p.pvActual < 0) p.pvActual = 0;
        hechizos.remove(hechizoLanzado);
    }

    @Override
    public int calcularPoder() {
        int poder = super.calcularPoder();
        for (Hechizo h : hechizos) poder += h.getPotencia();
        return poder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nHechizos memorizados:");
        for (Hechizo h : hechizos) {
            sb.append("\n  ").append(h);
        }
        return sb.toString();
    }
}


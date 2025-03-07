/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatallaNaval;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class BatallaNaval {
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean juegoTerminado;
    static Scanner teclado = new Scanner(System.in);

    public BatallaNaval() {
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.juegoTerminado = false;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }

    /**
     * Configura y comienza la partida.
     * @param jugador1
     * @param jugador2
     */
    public void iniciarJuego(String jugador1, String jugador2) {
        this.jugador1.setNombre(jugador1);
        this.jugador2.setNombre(jugador2);
    }

    /**
     * Maneja un turno de disparo.
     *
     * @param atacante
     * @param defensor
     */
    public void turno(Jugador atacante, Jugador defensor) {
        System.out.println("\n#### JUEGA ####: " + atacante.getNombre());
        System.out.println("Introduce Coordenadas de disparo:");
        System.out.print("x: ");
        int x = teclado.nextInt();
        System.out.print("y: ");
        int y = teclado.nextInt();
        atacante.realizarDisparo(defensor, x, y);
    }

    /**
     * Comprueba si hay un ganador.
     */
    public void verificarGanador() {
        Barco[] flotaJug1 = this.jugador1.getFlota();
        Barco[] flotaJug2 = this.jugador2.getFlota();
        int flota1 = 0, flota2 = 0;
        for (Barco b : flotaJug1) {
            if (b.estaHundido()) {
                flota1++;
            }
        }
        for (Barco b : flotaJug2) {
            if (b.estaHundido()) {
                flota2++;
            }
        }

        if (flota1 == flotaJug1.length) {
            System.out.println("Gana el jugador : " + this.jugador2.getNombre());
            this.juegoTerminado = true;
        } else if (flota2 == flotaJug2.length) {
            System.out.println("Gana el jugador : " + this.jugador1.getNombre());
            this.juegoTerminado = true;
        }
    }
}

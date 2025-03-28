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
public class MainBatallaNaval {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        BatallaNaval juego = new BatallaNaval();
        System.out.println("INICIA EL JUEGO #########################");
        System.out.println("Introduce el nombre del jugador 1: ");
        String nombre1 = teclado.nextLine();
        System.out.println("Introduce el nombre del jugador 2: ");
        String nombre2 = teclado.nextLine();

        juego.getJugador1().setNombre(nombre1);
        juego.getJugador2().setNombre(nombre2);

        System.out.println("\n----------------------------\n"
                +juego.getJugador1().getNombre() + ", coloca tu Flota");
        juego.getJugador1().colocarFlota();
        System.out.println("\n----------------------------\n"
                +juego.getJugador2().getNombre() + ", coloca tu Flota");
        juego.getJugador2().colocarFlota();

        System.out.println("\n#######################################################################\n");
        int turno = 0;
        while (!juego.isJuegoTerminado()) {
            if (turno % 2 == 0) {
                juego.turno(juego.getJugador1(), juego.getJugador2());
                System.out.println("TABLERO OPONENTE");
                juego.getJugador2().getTablero().mostrarTablero(true);
            } else {
                juego.turno(juego.getJugador2(), juego.getJugador1());
                System.out.println("TABLERO OPONENTE");
                juego.getJugador1().getTablero().mostrarTablero(true);
            }
            juego.verificarGanador();
            turno++;
        }
        teclado.close();
    }
}

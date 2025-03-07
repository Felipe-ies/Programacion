/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cagnaespindolafelipe.pkg2ºevaluación;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();
        System.out.println(juego.toString());

        System.out.println("---- Bienvenido ----\n");
        juego.inicializarMapa();
        juego.mostrarMapa();
        System.out.println("\nHay " + juego.contarTesoros() + " tesoros restantes.");

        while (juego.contarTesoros() > 0) {
            System.out.println("\nMOVER: arriba, abajo, izquierda, derecha");
            System.out.println("Puedes hacer varios movimientos a la vez (arriba abajo derecha)");
            String movimientos = sc.nextLine();
            System.out.println("");
            juego.procesarMovimientos(movimientos);
            juego.mostrarMapa();
            
            System.out.println("\nHay " + juego.contarTesoros() + " tesoros restantes.");
        }

        System.out.println("\n¡¡¡GANASTE!!!, Encontraste todos los tesoros.");

    }

}

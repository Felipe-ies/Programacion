/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg0.estructurasdecontrol;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dam
 */
public class Ruleta {

    public static void jugar() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        double dineroIni = 0;
        int casillero = 0;

        while (dineroIni <= 0) {
            System.out.println("Ingresa el monto inicial de dinero");
            dineroIni = teclado.nextDouble();
        }
        double dinero = dineroIni;
        double dineroRuleta = dinero * 100;

        while ((casillero < 16 || casillero > 36) || (casillero % 4 != 0)) {
            System.out.println("Ingresa el número de casillero de tu apuesta(Entre 16 y 36)");
            casillero = teclado.nextInt();
        }

        while (dinero > 0 && dinero <= (dineroIni * 50)) {
            System.out.println("-------------------------\n");
            double ganancias = 0;
            int ruleta = random.nextInt(0, casillero + 1);
            //Monto apuesta
            double apuestaDin = 0;
            while (apuestaDin <= 0 || apuestaDin > dinero) {
                System.out.println("Ingresa monto de apuesta");
                apuestaDin = teclado.nextDouble();
            }
            //Casillero apuesta
            int apuestaCas = -1;
            while (apuestaCas < 0 || apuestaCas > casillero) {
                System.out.println("Ingresa tu apuesta de casillero(Números impares son negros y los pares mayores que 0 son blancos)");
                apuestaCas = teclado.nextInt();
            }

            //Ruleta
            if (apuestaCas == ruleta) {
                ganancias = apuestaDin * 16;
                dinero += ganancias;
                dineroRuleta -= ganancias;
            } else if (apuestaCas > 0 && ((apuestaCas + ruleta) % 2 == 0)) {
                ganancias = apuestaDin * 1.8;
                dinero += ganancias;
                dineroRuleta -= ganancias;
            } else {
                dinero -= apuestaDin;
                dineroRuleta += apuestaDin;
            }

            System.out.println("\n-------------------------------------\nEl número seleccionado por la ruleta fue: " + ruleta);
            System.out.println("Jugador -> numero apostado: " + apuestaCas + " | Cantidad apostada: $" + apuestaDin + " | Ganancias de apuesta: $" + ganancias);

            System.out.println("\nDinero actual en la Ruleta: $" + dineroRuleta);
            System.out.println("Dinero actual del Jugador: $" + dinero);
            System.out.println("Se puede ganar: $" + (dineroIni * 50 - dinero));
        } //Fin de while de juego

        if (dinero > (dineroIni * 50)) {
            System.out.println("\nGanó el Jugador");
        } else if (dinero <= 0) {
            System.out.println("\nGana la casa");
        }
        teclado.close();
    }

}

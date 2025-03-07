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
public class Ventiuno {

    public static void jugar() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        final int partidas = 3;
        int dado1, dado2, suma, jugar = 1;
        int gana1 = 0, gana2 = 0;
        for (int i = 1; i <= partidas; i++) {
            int jugador1 = 0, jugador2 = 0;

            //Jugador 1
            System.out.printf("\n------------------Partida %d - Jugador 1------------------", i);
            System.out.print("\nTirar dados? (1.SI | 2.NO) -- ");
            jugar = teclado.nextInt();
            while (jugar < 1 || jugar > 2) {
                jugar = teclado.nextInt();
                System.out.print("Elige 1 para Si, 2 para No: ");
            }
            while (jugar == 1 && jugador1 <= 21) {
                dado1 = random.nextInt(1, 7);
                dado2 = random.nextInt(1, 7);
                suma = dado1 + dado2;
                jugador1 += suma;
                System.out.printf("\nHa obtenido los dados %d, %d", dado1, dado2);
                System.out.printf("\nPuntuación acumulada: %d\n", jugador1);

                if (jugador1 > 21) {
                    jugar = 0;
                } else {
                    System.out.print("\nDesea seguir tirando? (1.SI | 2.NO): ");
                    jugar = teclado.nextInt();
                    while (jugar < 1 || jugar > 2) {
                        jugar = teclado.nextInt();
                        System.out.print("Elige 1 para Si, 2 para No: ");
                    }
                }
            }

            if (jugar != 0) {
                System.out.printf("\n------------------Partida %d - Jugador 2------------------", i);
                System.out.print("\nTirar dados? (1.SI | 2.NO) -- ");
                jugar = teclado.nextInt();
                while (jugar < 1 || jugar > 2) {
                    jugar = teclado.nextInt();
                    System.out.println("Elige 1 para Si, 2 para No");
                }
            }
            //Jugador 2
            while (jugar == 1 && jugador2 <= 21) {
                dado1 = random.nextInt(1, 7);
                dado2 = random.nextInt(1, 7);
                suma = dado1 + dado2;
                jugador2 += suma;

                System.out.printf("\nHa obtenido los dados %d, %d", dado1, dado2);
                System.out.printf("\nPuntuación acumulada: %d\n", jugador2);

                if (jugador2 > 21) {
                    jugar = 0;
                } else {
                    System.out.print("\nDesea seguir tirando? (1.SI | 2.NO): ");
                    jugar = teclado.nextInt();
                    while (jugar < 1 || jugar > 2) {
                        jugar = teclado.nextInt();
                        System.out.print("Elige 1 para Si, 2 para No: ");
                    }
                }
            }

            //Determina ganador
            if (jugador1 == jugador2) {
                System.out.println("\n----Empate----");
            } else if (jugador1 <= 21 && (jugador1 > jugador2)) {
                System.out.println("\n----Gana Jugador 1----");
                gana1++;
            } else if (jugador2 <= 21 && (jugador2 > jugador1)) {
                System.out.println("\n----Gana Jugador 2----");
                gana2++;
            } else if (jugador1 > 21) {
                System.out.println("\nJugador 1 supera 21\n----Ganador: Jugador 2----");
                gana2++;
            } else {
                System.out.println("\nJugador 2 supera 21\n----Ganador: Jugador 1----");
                gana1++;
            }
        }
        if (gana1 > gana2) {
            System.out.printf("\nGANA JUGADOR 1 CON %d PARTIDAS\n", gana1);
        } else {
            System.out.printf("\nGANA JUGADOR 2 CON %d PARTIDAS\n", gana2);
        }

    }

}

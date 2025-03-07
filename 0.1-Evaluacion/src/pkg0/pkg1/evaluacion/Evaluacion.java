/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0.pkg1.evaluacion;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dam
 */

//Evaluación práctica 13/11/2024 - Felipe Cagna Espindola

public class Evaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creacion de objetos Scanner y Random
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        final int PARTIDAS = 3;
        int[] numeros = new int[3];
        //arrays de numeros que eligen los jugadores
        int[] jugador1 = new int[3];
        int[] jugador2 = new int[3];

        //arrays que guardan cantidad de intentos de jugadores
        int[] intJug1 = new int[PARTIDAS];
        int[] intJug2 = new int[PARTIDAS];

        for (int x = 0; x < PARTIDAS; x++) {
            int adivinados = 0;
            int intentos1 = 0, intentos2 = 0;
            System.out.printf("\n\n***PARTIDA %d***\n", (x + 1));

            //Creacion de randoms
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(0, 10);

                //Print de control. Activar para mostrar que numeros genera el random
                //System.out.println(numeros[i]); 
            }
            //Juega jugador 1
            System.out.println("- JUGADOR 1 -");
            while (adivinados < 3) {
                adivinados = 0;
                System.out.println("Introduce 3 numeros(0-9)");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("Numero %d(0-9): ", (i + 1));
                    jugador1[i] = teclado.nextInt();
                    while (jugador1[i] < 0 || jugador1[i] > 9) {
                        System.out.println("Introduce numeros entre 1 y 9");
                        jugador1[i] = teclado.nextInt();
                    }
                }
                intentos1++;
                System.out.println("\nPistas: ");
                for (int i = 0; i < 3; i++) {
                    if (jugador1[i] == numeros[i]) {
                        System.out.println("Verde");
                        adivinados++;
                    } else if (jugador1[i] == numeros[0] || jugador1[i] == numeros[1] || jugador1[i] == numeros[2]) {
                        System.out.println("Amarillo ");
                    } else {
                        System.out.println("Rojo");
                    }
                }
            }
            intJug1[x] = intentos1;
            System.out.printf("\nHas adivinado los numeros con %d intentos.\n", intentos1);

            //Creacion de randoms
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(0, 10);

                //Print de control. Activar para mostrar que numeros genera el random
                //System.out.println(numeros[i]);
            }

            //Juega jugador 2
            System.out.println("- JUGADOR 2 -");
            adivinados = 0;
            while (adivinados < 3) {
                adivinados = 0;
                System.out.println("Introduce 3 numeros(0-9)");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("Numero %d(0-9): ", (i + 1));
                    jugador2[i] = teclado.nextInt();
                    while (jugador2[i] < 0 || jugador2[i] > 9) {
                        System.out.println("Introduce numeros entre 1 y 9");
                        jugador2[i] = teclado.nextInt();
                    }
                }
                intentos2++;
                System.out.println("\nPistas: ");
                for (int i = 0; i < 3; i++) {
                    if (jugador2[i] == numeros[i]) {
                        System.out.println("Verde");
                        adivinados++;
                    } else if (jugador2[i] == numeros[0] || jugador2[i] == numeros[1] || jugador2[i] == numeros[2]) {
                        System.out.println("Amarillo ");
                    } else {
                        System.out.println("Rojo");
                    }
                }
            }
            intJug2[x] = intentos2;
            System.out.printf("\nHas adivinado los numeros con %d intentos.\n", intentos2);
            System.out.println("-------------------------------------------------");
            if (intentos1 < intentos2) {
                System.out.printf("\nGana jugador 1 con %d intentos", intentos1);
                System.out.printf("\nEl jugador 2 ha realizado %d intentos", intentos2);
            } else if (intentos1 > intentos2) {
                System.out.printf("\nGana jugador 2 con %d intentos", intentos2);
                System.out.printf("\nEl jugador 1 ha realizado %d intentos", intentos1);
            } else {
                System.out.println("\n--- EMPATE --- Los jugadores han realizado " + intentos1 + " intentos");
            }

        }

        //Suma y media de intento de jugadores
        int suma1 = 0, suma2 = 0;
        for (int i = 0; i < intJug1.length; i++) {
            suma1 += intJug1[i];
            suma2 += intJug2[i];
        }
        System.out.println("\n----------------------------------------------\n");
        System.out.println("La media de intentos del jugador 1 es: " + (suma1 / intJug1.length));
        System.out.println("La media de intentos del jugador 2 es: " + (suma2 / intJug2.length));

        //Se determina ganador por cantidad total de intentos
        if (suma1 < suma2) {
            System.out.printf("El ganador definitivo por suma de intentos es el jugador 1 con %d intentos totales.", suma1);
        } else if (suma1 > suma2) {
            System.out.printf("El ganador definitivo por suma de intentos es el jugador 2 con %d intentos totales.", suma2);
        } else {
            System.out.println("Hay un empate de intentos de ambos jugadores: " + suma1);
        }
        System.out.println("\n\n -----------Gracias por jugar ----------\n\n");
    }

}

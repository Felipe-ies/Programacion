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
public class Caballos {

    /**
     * @param args the command line arguments
     */
    public static void carrera() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        //Eleccion numero carreras
        System.out.println("Introduce el numero de carreras:");
        int numeroCarreras = teclado.nextInt();
        while (numeroCarreras < 2) {
            System.out.println("Introduce un numero mayor o igual a 2");
            numeroCarreras = teclado.nextInt();
        }
        //Eleccion largo pista
        System.out.println("Introduce el largo de la pista entre 200 y 800");
        int largoPista = teclado.nextInt();
        while (largoPista < 200 || largoPista > 800) {
            System.out.println("Error. Largo incorrecto. Introduce un numero entre 200 y 800");
            largoPista = teclado.nextInt();
        }
        //Creo caballos que van a correr. Empiezan en posicion 0.0
        double[] caballos = new double[random.nextInt(2, 11)]; //Array de caballos con sus posiciones, y cantidad random de 2 a 10

        //Ejecuta tantas carreras como elija
        for (int carreraActual = 1; carreraActual <= numeroCarreras; carreraActual++) {
            //Eleccion de caballos
            System.out.println("\n**********INICIANDO EL JUEGO NUMERO " + carreraActual + "**********\n");
            System.out.println("Jugador 1, elige caballo, de 1 a " + caballos.length);
            int jugador1 = teclado.nextInt();
            while (jugador1 < 1 || jugador1 > caballos.length) {
                System.out.println("Error. Elige caballo de 1 a " + caballos.length);
                jugador1 = teclado.nextInt();
            }
            System.out.println("Jugador 2, elige caballo, de 1 a " + caballos.length);
            int jugador2 = teclado.nextInt();
            while (jugador2 == jugador1 || jugador2 < 1 || jugador2 > caballos.length) {
                System.out.println("Error. Elige caballo de 1 a " + caballos.length + " y que no sea el mismo que aposto jugador 1: " + jugador1);
                jugador2 = teclado.nextInt();
            }
            System.out.printf("Jugador 1 apuesta al caballo %d.\nJugador 2 apuesta al caballo %d\n", jugador1, jugador2);
            
            //Bloque de variables
            jugador1 -= 1; //Adapta eleccion a index del array
            jugador2 -= 1; //Adapta eleccion a index del array
            boolean carrera = true;
            double mayor = 0, menor = largoPista;
            int ganador = -1, ultimo = -1;

            //Carrera
            while (carrera) {
                for (int i = 0; i < caballos.length; i++) {
                    double avance = random.nextInt(0, 10) - carreraActual * 0.1;
                    while (avance < 0) {
                        avance = random.nextInt(0, 10) - carreraActual * 0.1;
                    }
                    caballos[i] += avance;
                    System.out.println("El caballo " + (i + 1) + " está en la posición: " + caballos[i]);
                    
                    if (caballos[i] > largoPista) {
                        carrera = false;
                    }
                }
                System.out.println("");

            }
            
            //Eleccion de ganador y perdedor(caballo)
            for (int x = 0; x < caballos.length; x++) {
                if (mayor < caballos[x]) {
                    mayor = caballos[x];
                    ganador = x + 1;
                }
                if (menor > caballos[x]) {
                    menor = caballos[x];
                    ultimo = x + 1;
                }
            }
            
            //Eleccion de caballo y/o jugador que ganan
            if (ganador - 1 == jugador1) {
                System.out.println("\n-----Gana el caballo " + ganador + ", y el Jugador 1-----");
            } else if (ganador - 1 == jugador2) {
                System.out.println("\n-----Gana el caballo " + ganador + ", y el Jugador 2-----");
            } else {
                System.out.println("\n-----Gana el caballo " + ganador + "-----");
            }
            System.out.println("\n-----Queda último el caballo " + ultimo + "-----");
        }
        teclado.close();
    }
}

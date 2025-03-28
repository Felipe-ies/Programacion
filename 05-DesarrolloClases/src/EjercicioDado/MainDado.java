/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDado;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Felipe
 */
public class MainDado {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Cuantos jugadores hay?: ");
        int cantJug = teclado.nextInt();
        Dado[] jugadores = new Dado[cantJug];

        teclado.nextLine(); //Limpia Scanner

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = jugador();
            while (jugadores[i].getTiradas().length != jugadores[0].getTiradas().length) {
                System.out.println("Todos los jugadores deben tener igual cantidad"
                        + "de tiradas: " + jugadores[0].getTiradas().length);
                jugadores[i] = jugador();
            }
            System.out.println(jugadores[i]);
            System.out.println("Suma de dados: "+sumaDados(jugadores[i].getTiradas()));
        }
        //Contar cuantos dados iguales para cada jugador
        int[][] iguales = new int[jugadores.length][6];
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores[i].getTiradas().length; j++) {
                iguales[i][jugadores[i].getTiradas()[j] - 1]++;
            }
        }
        //Contabilizar por cada jugador la cantidad mayor de repeticiones
        int[] mayor = new int[jugadores.length];
        for (int i = 0; i < iguales.length; i++) {
            mayor[i] = iguales[i][0];
            for (int j = 0; j < iguales[i].length; j++) {
                if (mayor[i] < iguales[i][j]) {
                    mayor[i] = iguales[i][j];
                }
            }
        }
        //Encontrar al mayor numero de repeticiones
        int masRep = 0;
        int ganador = 0;
        for (int i = 0; i < mayor.length; i++) {
            masRep = mayor[0];
            if (masRep < mayor[i]) {
                masRep = mayor[i];
                ganador = i;
            }
        }
        //Ver si hay repetidos
        int contador = 0;
        for (int i = 0; i < mayor.length; i++) {
            if (masRep == mayor[i]) {
                contador++;
            }
        }
        boolean empate = false;
        int masSuma = 0;
        if (contador > 1) {
            ganador = 0;
            empate = true;
            masSuma = sumaDados(jugadores[0].getTiradas());
            for (int i = 0; i < jugadores.length; i++) {
                if (masSuma < sumaDados(jugadores[i].getTiradas())) {
                    masSuma = sumaDados(jugadores[i].getTiradas());
                    ganador = i;
                }
            }
        }
        if (empate) {
            System.out.println("El ganador es:" + jugadores[ganador].getNombre()
                    + " con suma total de: " + masSuma);
        } else {
            System.out.println("El ganador es: " + jugadores[ganador].getNombre()
                    + " con " + masRep + " repeticiones.");
        }

    }

    public static Dado jugador() {
        System.out.print("\nIntroduce tu nombre:");
        String nombre = teclado.nextLine();
        System.out.print("\nIntroduce cantidad de triadas:");
        int tiradas = teclado.nextInt();
        teclado.nextLine();//Limpiamos scanner

        Dado dado = new Dado(nombre, tiradas);

        return dado;
    }

    public static int sumaDados(int[] dados) {
        int suma = 0;
        for (int i = 0; i < dados.length; i++) {
            suma += dados[i];
        }
        return suma;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author dam
 */
public class EjercicioFunciones {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    static Random rd = new Random();

    public static void ejecutar() {
        // TODO code application logic here

        int[] lista = new int[50];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rd.nextInt(0, 100); //numeros de hasta 2 cifras
        }
        System.out.println("Lista de 50 números creada");
        System.out.println(Arrays.toString(lista));
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        int opcion = menu();
        while (opcion < 8) {
            switch (opcion) {
                case 1 -> {
                    System.out.println("El numero aparece en la posición");
                    System.out.println(buscarNumero(numero, lista));
                }
                case 2 -> {
                    System.out.println("El numero aparece " + 
                            vecesNumero(numero, lista) + " veces");
                }
                case 3 -> {
                    System.out.println("Veces que aparece el mayor");
                    System.out.println(vecesMayor(lista));
                }
                case 4 -> {
                    System.out.println(numVsMayor(numero, lista));
                }
                case 5 -> {
                    System.out.println("La media de la lista es: ");
                    System.out.println(mediaLista(lista));
                }
                case 6 -> {
                    System.out.println("La media entre el mayor y el menor es: ");
                    System.out.println(mediaMayorMenor(lista));
                }
                case 7 -> {
                    System.out.println("La lista inversa es: ");
                    System.out.println(Arrays.toString(inversaLista(lista)));
                }
            }
            opcion = menu();
        }
    }

    static int menu() {
        System.out.println("\n****MENU****");
        System.out.println("1. Imprimir posición de Numero en lista");
        System.out.println("2. Imprimir el número de veces que aparece");
        System.out.println("3. Buscar el número mayor y devolver cuantas veces aparece");
        System.out.println("4. Imprimir verdadero si el número leído aparece más veces que el mayor");
        System.out.println("5. Calcular la media de todos los números");
        System.out.println("6. Calcular la media entre el mayor y el menor");
        System.out.println("7. Crear una lista inversa a la dada");
        System.out.println("8. Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }

    static int buscarNumero(int numero, int[] lista) {
        int resultado = -1;
        int i = 0;
        boolean existe = false;
        while (!existe) {
            if (numero == lista[i]) {
                resultado = i;
                existe = true;
            }
            i++;
        }
        return resultado;
    }

    static int vecesNumero(int numero, int[] lista) {
        int cuentaNum = 0;
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                cuentaNum++;
            }
        }
        return cuentaNum;
    }

    static int vecesMayor(int[] lista) {
        int cuentaMayor = 0;
        int mayor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == mayor) {
                cuentaMayor++;
            }
        }
        System.out.println("El mayor es: " + mayor);
        return cuentaMayor;
    }

    static boolean numVsMayor(int numero, int[] lista) {
        boolean resultado = false;
        int mayor = lista[0];
        int vecesNum = 0, vecesMayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                vecesNum++;
            }
            if (vecesMayor == lista[i]) {
                vecesMayor++;
            }
        }
        if (vecesMayor < vecesNum) {
            resultado = true;
        }
        return resultado;
    }

    static double mediaLista(int[] lista) {
        double sumaLista = 0;
        for (int i = 0; i < lista.length; i++) {
            sumaLista += lista[i];
        }
        double media = sumaLista / lista.length;
        return media;
    }

    static double mediaMayorMenor(int[] lista) {
        double menor = lista[0], mayor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (menor > lista[i]) {
                menor = lista[i];
            }
            if (mayor < lista[i]) {
                mayor = lista[i];
            }
        }
        double media = (mayor - menor) / 2;
        return media;
    }

    static int[] inversaLista(int[] lista) {
        int x = lista.length - 1;
        int[] listaInv = new int[x + 1];
        for (int i = 0; i < lista.length; i++) {
            listaInv[i] = lista[x];
            x--;
        }
        return listaInv;
    }
}

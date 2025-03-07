/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class FuncionesEjem {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void ejecutar() {
        // TODO code application logic here
        ordenAsc();

        System.out.println("Tres numeros. Si el 1º es negativo imprime producto, sino suma");
        System.out.print("Introduce a: ");
        int a = teclado.nextInt();
        System.out.print("Introduce b: ");
        int b = teclado.nextInt();
        System.out.print("Introduce c: ");
        int c = teclado.nextInt();
        tresNums(a, b, c);

        System.out.println("Cuadrado");
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        System.out.println(cuadrado(numero));

    }

    //Funcion sin entrada ni salida
    static void ordenAsc() {
        System.out.println("Orden ascendente");
        System.out.print("Escribe un numero a: ");
        int A = teclado.nextInt();
        System.out.print("Escribe un numero b: ");
        int B = teclado.nextInt();
        if (A < B) {
            System.out.println(A + "," + B);
        } else {
            System.out.println(B + "," + A);
        }
    }

    //Funcion con entrada sin salida
    static void tresNums(int a, int b, int c) {
        int result_suma = a + b + c;
        int result_prod = a * b * c;
        if (a < 0) {
            System.out.println("El producto es: " + result_prod);
        } else {
            System.out.println("La suma es: " + result_suma);
        }
    }

    //Funcion con entrada y salida
    static int cuadrado(int numero) {
        int cuadrado = numero * numero;
        return cuadrado;
    }

}

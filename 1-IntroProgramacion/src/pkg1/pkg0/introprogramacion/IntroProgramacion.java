/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg0.introprogramacion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class IntroProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*holaMundo();
        cuadradoCubo();
        parImpar();
        temperatura();
        numAleatorio();
        */

        Ejercicios.ejercicios1();
        Ejercicios.ejercicios2();
        Ejercicios.ejercicios3();
    }

    public static void holaMundo() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce tus apellidos: ");
        String apellidos = teclado.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + " " + apellidos + " " + edad);

        System.out.println("El doble de tu edad es: " + edad * 2);
    }

    public static void cuadradoCubo() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        System.out.println("El cuadrado de " + num + " es: " + num * num);
        System.out.println("El cubo de " + num + " es: " + num * num * num);
        System.out.println("cubo de " + num);

    }

    public static void parImpar() {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un num: ");

        int numero = teclado.nextInt();

        int resto = numero % 2;

        System.out.println(resto);

        if (resto == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void temperatura() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce temeperatura: ");
        double temp = teclado.nextDouble();
        double min = temp, max = temp, contador = 0, suma = 0;
        while (temp > -1000) {
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
            if (temp > -1000) {
                suma += temp;
            }
            contador++;
            System.out.println("Introduce temeperatura: ");
            temp = teclado.nextDouble();
        }
        System.out.println("La media es: " + suma / contador);
        System.out.println("La maxima es: " + max);
        System.out.println("La minima es: " + min);
    }

    public static void numAleatorio() {
        // TODO code application logic here
        //Genera numero aleatorio entre 1 y 20.
        //el usuario tiene que adivinar el número. Si lo adivina, entonces el programa escribirá "Enhorabuena, lo has adivinado". 
        //Si no lo adivina escribirá "Lo siento no lo has adivinado"
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();
        int numero = rd.nextInt(1, 20);
        boolean adivino = false;
        System.out.println();
        while (!adivino) {
            System.out.println("Intenta adivinar el número entre 1 y 20");
            double input = teclado.nextDouble();
            if (input == numero) {
                System.out.println("Enhorabuena, lo has adivinado");
                adivino = true;
            } else {
                System.out.println("Lo siento no lo has adivinado");
            }
        }
    }
}

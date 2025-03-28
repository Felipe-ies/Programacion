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
public class Funciones {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void ejecutar() {
        // TODO code application logic here

        //Llamar la función
        imprimirMenu();
        int opcion = teclado.nextInt();

        while (opcion < 4) {
            int numero1 = leerNumero();
            int numero2 = leerNumero();
            switch (opcion) {
                case 1:
                    System.out.println("Sumar dos números");
                    System.out.println(numero1 + numero2);
                    break;
                case 2:
                    System.out.println("Restar dos números");
                    restarNumero(numero1,numero2);
                    break;
                case 3:
                    System.out.println("Multiplicar dos números");
                    System.out.println(multiplicarNumero(numero1, numero2));
                    break;
            }
            imprimirMenu();
            opcion = teclado.nextInt();
        }

    }

    //Declaración/Definición de la Función
    //Crear una función sin entradas ni salidas
    //tipoSalida nombreFuncion (paramsEntrada){}
    static void imprimirMenu() {
        System.out.println("*****Menu*****");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Salir");
    }

    //Crear una función que no reciba entradas y devuelva un valor
    static int leerNumero() {
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        while (numero > 10) {
            System.out.println("Error. Introduce un número:");
            numero = teclado.nextInt();
        }
        return numero;
    }

    //Crear una función que tenga entradas pero no salidas
    static void restarNumero(int numero1, int numero2) {
        System.out.println(numero1 - numero2);
    }
    
    //Crear una función que reciba enradas y devuelva un valor
    static int multiplicarNumero(int num1, int num2){
        return num1*num2;
    }

}

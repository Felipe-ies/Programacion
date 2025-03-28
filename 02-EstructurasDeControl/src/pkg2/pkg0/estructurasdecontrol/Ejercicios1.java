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
public class Ejercicios1 {
    
    public static void condYBucles(){
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        //Menu de ejercicios
        System.out.println("-----Elige ejercicio-----");
        System.out.println("Ejercicio 1: Sueldo y antiguedad");
        System.out.println("Ejercicio 2: Bisiesto?");
        System.out.println("Ejercicio 3: Notas del exámen");
        System.out.println("Ejercicio 4: Piedra, papel o tijera?");
        System.out.println("5: Salir");
        System.out.print("---------------------->>>>>>>>> ");
        int opcion = teclado.nextInt();

        while (opcion != 5) {

            switch (opcion) {
                case 1 -> {
                    //Ejercicio 1 - Sueldo y años de antiguedad
                    System.out.print("Introduce tu sueldo: ");
                    double sueldo = teclado.nextDouble();
                    System.out.print("Introduce tus años de antiguedad: ");
                    int antiguedad = teclado.nextInt();

                    if (sueldo >= 1000) {
                        System.out.println("Sueldo: " + sueldo);
                    } else {
                        if (antiguedad >= 10) {
                            sueldo = sueldo * 1.2;
                            System.out.println("Sueldo: " + sueldo);
                        } else {
                            sueldo = sueldo * 1.05;
                            System.out.println("Sueldo: " + sueldo);
                        }
                    }

                }
                case 2 -> {
                    //Ejercicio 2 - Años bisiestos
                    //Año bisiesto condiciones: multiplos de 4(excepto multiplos de 100, debe ser además multiplo de 400)
                    System.out.print("Ingresa año: ");
                    int cifra = teclado.nextInt();
                    boolean bisiesto = false;
                    if (cifra % 4 == 0) {
                        if (cifra % 100 == 0 && cifra % 400 == 0) {
                            bisiesto = true;
                        } else if (cifra % 100 != 0) {
                            bisiesto = true;
                        }
                    }
                    if (bisiesto && (cifra <= 2024)) {
                        System.out.println(cifra + " fue bisiesto.");
                    } else if (bisiesto && (cifra > 2024)) {
                        System.out.println(cifra + " será bisiesto.");
                    } else if (cifra < 2024) {
                        System.out.println(cifra + " no fue bisiesto.");
                    } else {
                        System.out.println(cifra + " no será bisiesto.");
                    }
                }
                case 3 -> {
                    //Ejercicio 3 - Notas de examen
                    int nota = 0, max = 0, min = 100, alumnos = 0;
                    double suma = 0;
                    while (nota >= 0) {
                        System.out.print("Ingresa nota: ");
                        nota = teclado.nextInt();
                        if (max < nota && nota >= 0) { 
                            max = nota;
                        }
                        if (min > nota && nota >= 0) { 
                            min = nota;
                        }
                        if (nota >= 0) {
                            suma += nota; 
                            alumnos++; 
                        }
                    }
                    System.out.printf("Se presentaron %d alumnos al examen.", alumnos);
                    System.out.println("La media es de " + (suma / alumnos));
                    System.out.printf("La nota mas alta es: %d, y la nota mas baja es: %d.", max, min);
                }
                case 4 -> {
                    //Ejercicio 4 - Piedra, papel o tijera
                    Random random = new Random();
                    final int partidas = 3;   //Cantidad de partidas a jugar
                    int ganaPc = 0, ganaJug = 0;

                    System.out.printf("----Se jugaran %d partidas", partidas);
                    for (int i = 0; i < partidas; i++) {
                        int pcElige = random.nextInt(1, 4); //Para pc será tambíen: 1 = Piedra, 2 = Papel, 3 = Tijera 
                        System.out.print("--------------------------------\nElije: Piedra(1), Papel(2) o Tijera(3)?\n---->>>>");
                        int jugElige = teclado.nextInt();

                        switch (pcElige) {
                            case 1 ->
                                System.out.println("Pc: Piedra");
                            case 2 ->
                                System.out.println("Pc: Papel");
                            case 3 ->
                                System.out.println("Pc: Tijera");
                        }

                        if (jugElige == pcElige) {
                            System.out.println("-----EMPATE-----");
                        } else if ((jugElige == 1 && pcElige == 3) || (jugElige == 2 && pcElige == 1) || (jugElige == 3 && pcElige == 2)) {
                            System.out.println("-----Gana Jugador-----");
                            ganaJug++;
                        } else {
                            System.out.println("-----Gana Pc-----");
                            ganaPc++;
                        }
                    }
                    System.out.printf("\nPartidas ganadas:\n Pc = %d  |  Jugador = %d\n", ganaPc, ganaJug);
                }

            }//Fin del switch

            //Menu de ejercicios
            System.out.println("\n-----Elige ejercicio-----");
            System.out.println("Ejercicio 1: Sueldo y antiguedad");
            System.out.println("Ejercicio 2: Bisiesto?");
            System.out.println("Ejercicio 3: Notas del exámen");
            System.out.println("Ejercicio 4: Piedra, papel o tijera?");
            System.out.println("5: Salir");
            System.out.print("---------------------->>>>>>>>> ");
            opcion = teclado.nextInt();
        }//Fin del while "menu de ejercicios"
    }

}

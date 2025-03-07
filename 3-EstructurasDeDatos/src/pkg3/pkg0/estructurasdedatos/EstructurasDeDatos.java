/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg0.estructurasdedatos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicios.ejercicios1();
        Ejercicios.ejercicios2();
        Ejercicios.ejercicios4();
        Ejercicios.charArray();
        Ejercicios.ahorcado();
        Ejercicios.alanSmithee();
        Ejercicios.arraysMulti();
        
    }

    public static void arrays() {
        //Declarar arrays
        int[] listaEnteros;
        //Declarar y Crear un array (cuando sabemos los elementos)
        int[] listaEnteros2 = {4, 5, 6, 7};

        //Declarar y Crear un array 
        int[] listaEnteros3 = new int[10]; //10 lugares en memoria para valores

        for (int i = 0; i < 4; i++) {
            System.out.println(i + " " + listaEnteros2[i]);

            int[] lista = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        }
    }

    public static void usoClaseArrays() {
        // TODO code application logic here
        int[] array = {6, 7, 8, 9, 19, 10, 2};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);//Ordena el array
        System.out.println(Arrays.toString(array));

    }

    public static void strings() {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        
        char caracter = 'a';
        
        int ascii = (int) caracter;
        System.out.println(ascii);
        
        for(int i=0; i<20; i++){
            for(int j=0; j<10; j++){
                System.out.print((char) (10*i + j));
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
        //Crear e imprimir una cadena de caracteres
        String cadena = "hola mundo";
        System.out.println(cadena);
        
        //Leer una linea
        System.out.println("Introduce una linea");
        String linea = teclado.nextLine();
        System.out.println(linea);
        
        //Crear e imprimir sin salto de linea
        System.out.print(cadena);
        
        //Leer hasta un espacio en blanco (una palabra)
        String palabra = teclado.next();
        System.out.println(palabra);
        
        //Comparar cadenas
        String cadena2 = "Hola";
        String cadena3 = new String("HOLA");

        System.out.println(cadena2 == cadena3);
        System.out.println(cadena2.equals(cadena3));

        //Desea continuar
        System.out.println("¿Desea continuar (Si|No)?");
        //String respuesta = teclado.nextLine();
        String respuesta = "si";

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Dijo SI");
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("Dijo NO");
        } else {
            System.out.println("Escribi bien wachooo");
        }

        
        //Obtener caracter en posicion 2
        String cadena4 = "Hola";
        System.out.println(cadena4.charAt(0));
        
        //Si queremos ver la longitud de una linea
        System.out.println(cadena4.length());
        
        for(int i=0; i<cadena4.length();i++){
            System.out.print((int) cadena4.charAt(i) + " ");
        }
        System.out.println("");
        
        System.out.println(cadena4.toUpperCase());
        System.out.println(cadena4.toLowerCase());
        
        //Pasar de un string a un array de char
        String texto = "Hola bebe, ia k contigo no sirbe la lavia";
        char[] arrayChar = texto.toCharArray();
        System.out.println(arrayChar);
        
        //Posicion de un caracter en una lista
        int posicion = texto.indexOf('o');
        System.out.println(posicion);
        System.out.println(texto.indexOf('a'));
        
        //Reemplazar caracteres
        System.out.println(texto.replaceAll("a", "5"));
        System.out.println(texto.replace("e", "@"));
        
        //Substring para obtener una cadena
        System.out.println(texto.substring(4,9));


        
        
        final int partidas = 2;   //Cantidad de partidas a jugar
        int ganaPc = 0, ganaJug = 0;

        //System.out.printf("----Se jugaran %d partidas", partidas);
        JOptionPane.showMessageDialog(null, "----Se jugaran " + partidas + " partidas");
        for (int i = 0; i < partidas; i++) {
            int pcElige = random.nextInt(1, 4); //Para pc será tambíen: 1 = Piedra, 2 = Papel, 3 = Tijera 
            System.out.print("--------------------------------\nElije: Piedra(1), Papel(2) o Tijera(3)?\n---->>>>");
            String jugElige = JOptionPane.showInputDialog("Elije: Piedra, Papel o Tijera");
            //int jugElige = teclado.nextInt();
            String pcE = "";
            switch (pcElige) {
                case 1 -> {
                    System.out.println("Pc: Piedra");
                    pcE = "Piedra";
                }
                case 2 -> {
                    System.out.println("Pc: Papel");
                    pcE = "Papel";
                }
                case 3 -> {
                    System.out.println("Pc: Tijera");
                    pcE = "Tijera";
                }
            }

            if (jugElige.equalsIgnoreCase(pcE)) {
                //System.out.println("-----EMPATE-----");
                JOptionPane.showMessageDialog(null, "-----EMPATE-----");
            } else if ((jugElige.equalsIgnoreCase("piedra") && pcE.equalsIgnoreCase("tijera")) || (jugElige.equalsIgnoreCase("papel") && pcE.equalsIgnoreCase("piedra")) || (jugElige.equalsIgnoreCase("tijera") && pcE.equalsIgnoreCase("papel"))) {
                JOptionPane.showMessageDialog(null, "-----Gana Jugador-----");
                ganaJug++;
            } else {
                JOptionPane.showMessageDialog(null, "-----Gana Pc-----");
                ganaPc++;
            }
        }
        String mensaje = "Partidas ganadas: Pc = " + ganaPc + " | Jugador = " + ganaJug;
        JOptionPane.showMessageDialog(null, mensaje);
         
 
        char c = 'A';
        String s = Character.toString(c);
        System.out.println(s);  // Imprime "A"*/
        boolean prueba = "i".equals('i');
        boolean prueba2 = "i".equals("i");
        System.out.println(prueba);
        System.out.println(prueba2);
    }
}

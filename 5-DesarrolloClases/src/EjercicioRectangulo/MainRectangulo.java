/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRectangulo;

import java.util.Random;

/**
 *
 * @author Felipe
 */
public class MainRectangulo {

    public static void main(String[] args) {
        Random rd = new Random();
        Rectangulo[] arrayRec = new Rectangulo[rd.nextInt(10, 1001)];
        //Crea rectangulos de varias dimensiones para cada index del array
        for (int i = 0; i < arrayRec.length; i++) {
            int base = rd.nextInt(1, 11);
            int altura = rd.nextInt(1, 11);
            arrayRec[i] = new Rectangulo(base, altura);
        }
        System.out.println("Se crearon " + arrayRec.length + " rectangulos.");
        
        //Contadores
        int contCuad = 0;
        int contMayorA = 0;
        int contMayorP = 0;
        int contMayorL = 0;
        //Imprimir rectangulos cuadrados
        for (int i = 0; i < arrayRec.length; i++) {
            if (arrayRec[i].getEsCuadrado()) {
                System.out.println(arrayRec[i].toString());
                contCuad ++;
            }
        }
        System.out.println("\nHay "+contCuad + " cuadrados");

        //Imprime rectangulo con mayor area
        int mayorArea = 0;
        int recMayA = 0;
        for (int i = 0; i < arrayRec.length; i++) {
            if (mayorArea < arrayRec[i].area()) {
                mayorArea = arrayRec[i].area();
                recMayA = i;
                contMayorA ++;
            }
        }
        System.out.println("\nEl Rectangulo con mayor area es: " + arrayRec[recMayA].toString());
        System.out.println("Hay " + contMayorA + " rectangulos con esa area");

        //Imprime rectangulo con mayor perimetro
        int mayorPer = 0;
        int recMayP = 0;
        for (int i = 0; i < arrayRec.length; i++) {
            if (mayorPer < arrayRec[i].perimetro()) {
                mayorPer = arrayRec[i].perimetro();
                recMayP = i;
                contMayorP ++;
            }
        }
        System.out.println("\nEl Rectangulo con mayor perimetro es: " + arrayRec[recMayA].toString());
        System.out.println("Hay " + contMayorP + " rectangulos con ese perimetro");

        //Imprime rectangulo con mayor lado
        int recMayLado = 0, mayorLado = 0;
        for (int i = 0; i < arrayRec.length; i++) {
            if (mayorLado < arrayRec[i].ladoMayor()) {
                mayorLado = arrayRec[i].ladoMayor();
                recMayLado = i;
                contMayorL ++;
            }
        }
        System.out.println("\nEl Rectangulo con mayor lado es: " + arrayRec[recMayLado].toString());
        System.out.println("Hay " + contMayorL + " rectangulos con ese lado");

        //Convierte rectangulo de mayor lado en cuadrado, especificando cambio
        boolean convertido = arrayRec[recMayLado].convertirEnCuadrado();
        System.out.println("\nRectangulo convertido: " + arrayRec[recMayLado].toString());
        System.out.println("Se cambia la base? " + convertido);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sandbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Metodos {

    private static final Scanner TECLADO = new Scanner(System.in);

    /**
     * Funcion que lee archivos
     *
     * @param ruta Ruta completa del archivo
     * @return Datos del archivo en String
     */
    public static String openFile(String ruta) {
        try {
            File file = new File(ruta);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
            fr.close();
            br.close();
            return data.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }
    
    /**
     * Funcion para escribir archivos
     * 
     * @param ruta Ruta completa al archivo
     * @param datos Cadena a escribir en archivo
     */
    public static void writeFile(String ruta, String datos) {
        try {
            File file = new File(ruta);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /**
     * Muestra un menu y recibe numero de opción. Valida que el número que el
     * usuario ingresa esté en el rango
     *
     * @param menu Lista de Strings con cada opcion del menu
     * @return Devuelve el número elegido por el usuario
     */
    public static int menu(String[] menu) {
        System.out.println("#### MENU ####");
        for (String s : menu) {
            System.out.println(s);
        }
        int opcion = TECLADO.nextInt();
        while (opcion < 1 || opcion > menu.length) {
            System.out.printf("Elije opcion desde %d hasta %d\n", 1, menu.length);
            opcion = TECLADO.nextInt();
        }
        TECLADO.close();
        return opcion;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenadores;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Prueba {
    public static void main(String[] args){
        /*
        Ordenador ord = new Ordenador("Windows", 16, "i7", 1000);
        System.out.println(ord);
        ord.imprimirTipo();
        */
        
        Portatil portatil = new Portatil(true, 30, "Linux", 16, "i5", 500);
        System.out.println(portatil);
        portatil.imprimirTipo();
        
        PC pc = new PC("Micro-ATX", "Windows", 8, "i3", 256);
        System.out.println(pc);
        pc.imprimirTipo();
        
        ArrayList<Ordenador> listaOrdenadores = new ArrayList<>();
        
        listaOrdenadores.add(pc);
        listaOrdenadores.add(portatil);
        
        for(int i=0; i<listaOrdenadores.size(); i++){
            listaOrdenadores.get(i).imprimirTipo();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjPublicacion;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class MainPublicacion { 
    public static void main(String[] args){
        ArrayList<Publicacion> publicaciones = new ArrayList<>(); 
        publicaciones.add(new Libro(65498765, "1984", 1949)); 
        publicaciones.add(new Libro(12345678, "El principito", 1995));
        publicaciones.add(new Revista(98765432, "National Geographic", 125, 2015));
        publicaciones.add(new Revista(87654321, "Science Today", 300, 2018));
        
        // Prestar un libro
        if (publicaciones.get(0) instanceof Libro) {
            ((Libro) publicaciones.get(0)).prestar();
        }
        
        // Imprimir publicaciones
        imprimirPublicaciones(publicaciones);
        
        // Contar prestados
        System.out.println("Publicaciones prestadas: " + cuentaPrestados(publicaciones));
        
        // Contar publicaciones anteriores a 1980
        System.out.println("Publicaciones anteriores a 1980: " + publicacionesAnterioresA(publicaciones, 1980));
        
        // Contar revistas
        System.out.println("Cantidad de revistas: " + cuentaRevistas(publicaciones));
    }
    
    public static int cuentaPrestados(ArrayList<Publicacion> publicaciones){
        int prestados = 0;
        for(Publicacion p: publicaciones){
            if (p instanceof Libro && ((Libro) p).prestado()) {
                prestados++;
            }
        }
        return prestados;
    }
    
    public static int publicacionesAnterioresA(ArrayList<Publicacion> publicaciones, int anno){
        int cantidad = 0;
        for(Publicacion p: publicaciones){
            if(p.getAnnoPublicacion() < anno){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static int cuentaRevistas(ArrayList<Publicacion> publicaciones){
        int cantidad = 0;
        for(Publicacion p: publicaciones){
            if(p instanceof Revista){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static void imprimirPublicaciones(ArrayList<Publicacion> publicaciones){
        for (Publicacion p : publicaciones) {
            System.out.println(p.toString());
        }
    }
}

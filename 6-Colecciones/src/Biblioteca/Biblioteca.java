/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.ArrayList;
/**
 *
 * @author Felipe
 */
public class Biblioteca {
    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    
    public boolean agregarLibro(Libro l){
        int i = 0;
        while (i < libros.size() &&
                libros.get(i).getTitulo().compareTo(l.getTitulo()) < 0) {
            i++;
        }
        libros.add(i, l);
        return true;
    }
    
    public int buscarLibro(String titulo){
        for(int i=0; i<this.libros.size(); i++){
            if(libros.get(i).getTitulo().compareToIgnoreCase(titulo) > 0){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return this.libros.toString();
    }
    
    public int nLibrosSinCopias(){
        int contador = 0;
        for(int i=0; i<this.libros.size(); i++){
            if(this.libros.get(i).getCopias() == 0){
                contador ++;
            }
        }
        return contador;
    }
}

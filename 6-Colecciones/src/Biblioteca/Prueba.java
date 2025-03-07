/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Felipe
 */
public class Prueba {

    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", "654987613", 1970, 15);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "123456789", 1967, 0);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "987654321", 1605, 5);
        
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.agregarLibro(libro3);
        
        System.out.println(biblio.buscarLibro("1984"));
        
        System.out.println(biblio.nLibrosSinCopias());
        
    }
}

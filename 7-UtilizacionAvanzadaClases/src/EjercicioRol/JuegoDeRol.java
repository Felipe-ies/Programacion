/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRol;

/**
 *
 * @author dam
 */
public class JuegoDeRol {
    public static void main(String[] args) {
        try {
            Personaje[] personajes = new Personaje[3];
            Mago gnomo = new Mago("Gnomo Ilusionista", "gnomo", 8, 18, 300, 300);
            Mago elfo = new Mago("Elfo Guerrero", "elfo", 9, 16, 320, 320);
            Clerigo chaman = new Clerigo("Chamán", "humano", 10, 15, 400, 400, "Dios Solar");

            personajes[0] = gnomo;
            personajes[1] = elfo;
            personajes[2] = chaman;

            System.out.println("Personajes iniciales:");
            for (Personaje p : personajes) System.out.println(p);

            // El Gnomo aprende 3 hechizos
            gnomo.aprendeHechizo(new Hechizo("Fuego", 10));
            gnomo.aprendeHechizo(new Hechizo("Tierra", 20));
            gnomo.aprendeHechizo(new Hechizo("Aire", 30));

            // El Elfo aprende un hechizo
            elfo.aprendeHechizo(new Hechizo("Agua", 30));

            System.out.println("\nInformación de los magos:");
            System.out.println(gnomo);
            System.out.println(elfo);

            // El gnomo lanza "Tierra" sobre el elfo
            gnomo.lanzaHechizo(elfo, "Tierra");

            // El elfo lanza cualquier hechizo sobre el gnomo
            elfo.lanzaHechizo(gnomo, "Agua");

            // El chaman cura al elfo
            chaman.curar(elfo);

            // El gnomo lanza "Aire" sobre el elfo
            gnomo.lanzaHechizo(elfo, "Aire");

            System.out.println("\nInformación final de todos los personajes:");
            for (Personaje p : personajes) System.out.println(p);

        } catch (PersonajeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


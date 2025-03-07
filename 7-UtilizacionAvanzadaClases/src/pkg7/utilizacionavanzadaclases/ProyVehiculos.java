/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.utilizacionavanzadaclases;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author dam
 */
public class ProyVehiculos {
    public static void main(String[] args){
        
        Coche coche = new Coche("5678ACF", Color.RED, "Ford", "Focus");
        System.out.println(coche);
        
        coche.setMatricula("654968L");
        
        Avion avion = new Avion(200, Color.white, "Iberia", "asassa");
        
        System.out.println(avion);
        
        avion.setnPasajeros(0);
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(coche);
        listaVehiculos.add(avion);
        
        for(int i =0; i<listaVehiculos.size(); i++){
            listaVehiculos.get(i).imprimirTipo();
        }
        
    }
}

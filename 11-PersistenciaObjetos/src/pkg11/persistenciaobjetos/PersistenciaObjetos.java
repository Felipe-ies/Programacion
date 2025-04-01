/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.persistenciaobjetos;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author dam
 */
public class PersistenciaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Abrir la conexión con la Base de Datos local
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdbpersonas.odb");
        EntityManager em = emf.createEntityManager();

        System.out.println("INSERCIÓN");

        //Iniciar transacción e insertar datos
        /*
        Una transacción en una base de datos es:
        Si hay una lista de funciones a ejecutar y 1 falla,
        no se ejecutará nada
         */
        em.getTransaction().begin();
        Persona juan = new Persona("Juan",30);
        em.persist(juan);
        Persona ana = new Persona("Ana",25);
        em.persist(ana);
        
        //Ejecuta la transacción(si no falla nada)
        em.getTransaction().commit();
        
        //Consultar datos(como un SELECT)
        TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona p", Persona.class);
        List<Persona> personas = query.getResultList();
        
        for(int i=0; i<personas.size(); i++){
            System.out.println(personas.get(i));
        }
        
        em.close();
        emf.close();
    }
}



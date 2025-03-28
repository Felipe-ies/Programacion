/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.gestionbasededatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dam
 */
public class GestionBaseDeDatos {

    /**
     * @param args the command line arguments
     */
    
    private static final String URL = "jdbc:mysql://localhost:3306/ejemploDB";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";
    
    public static void main(String[] args) {
        try {
            //Crear conexión con base de datos
            Connection conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa");
            
            //Preparar la consulta SQL para insertar usuario de forma segura
            //Usamos PreparedStatement para evitar la inyección de SQL, ya que son
            // valores parametrizados
            String sqlInsert = "INSERT INTO usuarios (nombre, correo) VALUES (?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(sqlInsert);
            sentencia.setString(1, "Juan"); //1º parametro
            sentencia.setString(2, "juan@example.com"); //2º parametro
            sentencia.executeUpdate();
            System.out.println("Usuario insertado correctamente");
            
            //Prepara consulta SELECT
            //Aquí se puede ejecutar directamente ya que no hay riesgo de injección SQL
            String sqlSelect = "SELECT * FROM usuarios";
            Statement consulta = conexion.createStatement();
            ResultSet resultado = consulta.executeQuery(sqlSelect);
            
            //Mostrar datos
            System.out.println("\nLista de usuarios:");
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String correo = resultado.getString("correo");
                System.out.printf("%d - %s - %s\n",id,nombre,correo);
            }
            
            //Cerrar conexión
            conexion.close();
            System.out.println("Conexión cerrada");
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

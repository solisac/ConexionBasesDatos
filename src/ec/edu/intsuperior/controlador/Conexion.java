/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Santiago
 */
public class Conexion {
    static String mensaje;
    static Connection conexion;
    
    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/registro?ServerTimezone=UTC";
        String user="root";
        String passwd="root";
        
        try {
            conexion=DriverManager.getConnection(url, user, passwd);
            mensaje="Conexion exitosa";
            return conexion;
            
        } catch (Exception e) {
            mensaje ="error";
            return null;
        }   
    }
    
    public static void cerrarConexion(){
        try {
            conexion.close();
            mensaje="Se cerro la conexion";
        } catch (Exception e) {
            mensaje="nunc existio alguna conexion";
        }
    }
    
    public static String getMensaje(){
        return mensaje;
    }
}

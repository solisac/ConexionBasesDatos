/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Conexion;
import java.sql.Connection;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    public static void main(String[] args) {
        Conexion.cerrarConexion();
        System.out.println(Conexion.getMensaje());
    }
    
}
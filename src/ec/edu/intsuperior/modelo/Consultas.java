/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Consultas {

    static boolean existe1=false;
    static boolean existe2=false;
    
    public static boolean getUser(String txtUser) {
        Connection con = Conexion.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from user");
            while (rs.next()) {
                if (rs.getString(2).equals(txtUser)) {
                  existe1=true; 
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return existe1;
    }

    public static boolean getPasswd(String txtPAsswd){
        try {
            Statement st= Conexion.getConnection().createStatement();
            ResultSet rs= st.executeQuery("Select * from user");
            while(rs.next()){
                if (rs.getString(3).equals(txtPAsswd)){
                    existe2=true;
                }
            }
        } catch (Exception e) {
        }
        return existe2;
    }
    
    
      public static void insertar(int id, String user, String passwd){
        Connection con = Conexion.getConnection();
        PreparedStatement ps;
        String sql;
        try{
             sql = "insert into user(iduser, nombreuser, passwd) values(?,?,?)";
            ps = con.prepareStatement(sql);  
            ps.setInt(1, id);
            ps.setString(2, user);
            ps.setString(3, passwd);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Loggin;

/**
 *
 * @author Santiago
 */
public class Controlador {
    
    Loggin loggin= new Loggin(this);
    
    public void mostrarLoggin(){
        loggin.setVisible(true);
    }
    
    
    
}

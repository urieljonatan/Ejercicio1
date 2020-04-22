/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

import javax.swing.JOptionPane;

/**
 *
 * @author Uriel Solano
 */
public class prueba {
    public static void main (String []args){
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
        Metodo.Evaluar(numero);
    }
    
}

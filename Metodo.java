/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo; // Se crea el paquete metodo

/**Programa que realize una serie dada usando un metodo que retorne un String con la serie solicitada
 *
 * @author Uriel Jonatan Solano Jeronimo
 * @version 21/4/20
 */
public class Metodo {
    
    /**
     * Metodo´principal que ejecuta el programa
     * @param numero
     * @return 
     */    
        public static String Evaluar(int numero){  // Inicio del String 
        if(numero<0){ // Compara el valor de numero es menor a 0
            String numeros=Integer.toString(numero);// Convierte de entero a cadena
            System.out.print(numero);//Imprime numero si se cumple la condicion de que numero sea menor a cero
            return numeros;// Retorna el valor de numeros
        }else{// Fin del if e inicio del else
            if(numero>0){// Compara si numero es mayor a 0
                String serie="22 11 34 17 52 26 13 40 20 10 5 16 8 4 21";// Se guarda en serie la serie dada
                System.out.print(serie);//Imprime serie
                return serie;// Retorna el valor de serie
            }
        }
        return "";// Retorna vacio
    }
}


    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

/**
 *
 * @author Oscar Juarez - 17315
 * @author Andres Urizar - 17632
 */
public class Factory {
    
    public String getImplementacion(String forma){ //Tipo de la interfaz
        if(forma.equals("1")){
            System.out.println("Ha utilizado Hashmap");
            
        }
        else if(forma.equals("2")){
            System.out.println("Ha utilizado TreeMap");
           
        }
        else if(forma.equals("3")){
            System.out.println("Ha utilizado LinkedHashMap");
            
        }
        return null;
    }
}

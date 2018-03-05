/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;
import java.util.*;

/**
 *
 * @author Oscar Juarez - 17315
 * @author Andres Urizar - 17632
 */
public class Factory {
    
    public Map getImplementacion(int tipo){ //Tipo de la interfaz
        if(tipo==1){          
            System.out.println("Ha utilizado Hashmap");
            return new HashMap();            
        }
        
        else if(tipo==2){
            System.out.println("Ha utilizado TreeMap");
            return new TreeMap();            
        }
        
        else {
            System.out.println("Ha utilizado LinkedHashMap");
            return new LinkedHashMap();            
        }        
    }
}

/**
 * Clase factory que devuelve la implementacion que desea usar el usuario.
 * Algoritmos y estructuras de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Andres Urizar - 17632
 * @version: 9/03/18
 */
package hojadetrabajo6;
import java.util.*;

public class Factory {        
    
    public static Map getImplementacion(int tipo){ //Tipo de la interfaz
        if(tipo==1){          
            System.out.println("Ha utilizado Hashmap");
            return new HashMap<String, String>();            
        }
        
        else if(tipo==2){
            System.out.println("Ha utilizado TreeMap");
            return new TreeMap<String, String>();            
        }
        
        else {
            System.out.println("Ha utilizado LinkedHashMap");
            return new LinkedHashMap<String, String>();            
        }        
    }    
    
}

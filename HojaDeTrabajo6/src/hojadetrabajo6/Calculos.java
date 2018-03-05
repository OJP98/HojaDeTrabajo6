/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Calculos {
    
    public String leerArchivo(String cadena) {
                        
        File f;
        FileReader fr;
        BufferedReader br;

        String postFix = "";

       //Este bloque de codigo tiene como objetivo leer la cadena de texto que
       //el usuario haya establecido previamente
        try {

            f = new File (cadena);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            
            String linea;

            while( (linea = br.readLine()) != null) {
                postFix += linea;
            }                                            
            
            br.close();
            fr.close();

        }
        //Si el archivo se modifica manualmente o sucede cualquier otros tipo de
        //error, este sera comunicado con el usuario
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                

        return postFix;

    }
    
}

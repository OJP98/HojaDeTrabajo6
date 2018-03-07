/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HojaDeTrabajo6 { 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculos calculo = new Calculos();
        String postFix = calculo.leerArchivo("./card_desc.txt");

            

        Scanner teclado = new Scanner(System.in);

        boolean power = true;
        
        System.out.println("Bienvenido al programa!");
        
        while (power) {
            
            System.out.println("\n______________________________________________\n");
            System.out.println("Ingrese la accion que desea realizar:\n");
            System.out.println("1. Agregar una carta a la coleccion del usuario");
            System.out.println("2. Mostrar el tipo de una carta especifica");
            System.out.println("3. ");
            
            
            
        }
        
        
        
        
        // TODO code application logic here
        
    }
    
}

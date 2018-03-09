/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Calculos {
        
    Map<String, String> MapCartas;
    HashMap<String, String> listaCartas = new HashMap();
    ArrayList<Cartas> mazoUsuario = new ArrayList<Cartas>();        
    
    public Calculos(int decision) {
        
        MapCartas = Factory.getImplementacion(decision);                  
              
    }
       
    public void leerArchivo(String archivo) {
                        
        File f;
        FileReader fr;
        BufferedReader br;
        String postFix = "";
        int pos;
        String nombre="";
        String tipo="";
        int largo;        
        
       //Este bloque de codigo tiene como objetivo leer la cadena de texto que
       //el usuario haya establecido previamente
        try {

            f = new File (archivo);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            
            String linea;

            while( (linea = br.readLine()) != null) {                                
                
                largo = linea.length();
                postFix += linea;
                
                pos = linea.indexOf("|");
                nombre = linea.substring(0,pos);
                tipo = linea.substring(pos+1,largo);
                                  
                MapCartas.put(nombre, tipo);
                listaCartas.put(nombre, tipo);
                
            }                                            
            
            br.close();
            fr.close();                        

        }
        //Si el archivo se modifica manualmente o sucede cualquier otros tipo de
        //error, este sera comunicado con el usuario
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                             
    }
    
    public ArrayList<Cartas> agregarCarta(String nombre, ArrayList<Cartas> mazo){   
        
        boolean encontrado = false;
        
        for (Map.Entry<String, String> i :  MapCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            if (nombre.equals(key)) {                
                
                Cartas temporal = new Cartas(key,value);
                
                encontrado = true;
                
                mazo.add(temporal); 
                
                MapCartas.remove(key);
                
                System.out.println("\nCarta agregada a su mazo!");
                break;
                
            }       
        }

        if (!encontrado) System.err.println("\nLa carta ingresada no existe o ya esta en su mazo");
        
        return mazo;
        
    }    
    
    public String mostrarTipo(String nombre) {
        
        boolean encontrado = false;
        String tipo="";
        
        for (Map.Entry<String, String> i :  listaCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            if (nombre.equals(key)) {
                
                tipo = value;  
                encontrado = true;
                
            }                
        }
        
        if (!encontrado) {
            
            tipo = "N/A";
            System.err.println("No se encontro la carta ingresada");
            
        }
        
        return tipo;
    }
    
    public String mostrarMazo(ArrayList<Cartas> mazo) {
                
        String lista="";
        int contador = 0;
        
        if (mazo.isEmpty()) {
            
            return "Ninguna carta";
            
        } else {
        
            for (Cartas i: mazo) {

                lista += contador+1 + ". " + i.toString()+"\n";
                contador++;

            }            
        }
        
        return lista;
        
    }
    
    public String imprimirPorTipo(ArrayList<Cartas> mazo){
        
        String lista="";
        String monstruos="";
        String hechizos="";
        String trampas="";
        
        if (mazo.isEmpty()) return "Ninguna carta";
        
        else {
            
            for (Cartas i: mazo) {
                
                String tipo = i.getTipo();
                
                if (tipo.equals("Monstruo")) {
                    
                    monstruos += i.porTipo() + "\n";
                    
                } else if (tipo.equals("Hechizo")) {
                    
                    hechizos += i.porTipo() + "\n";                    
                    
                } else if (tipo.equals("Trampa")) {
                    
                    trampas += i.porTipo() + "\n";
                }                
            }
            
            lista = monstruos + hechizos + trampas;
            
        }
       
        return lista;
    }
    public String imprimirTipolista(){
        String lista = "";
        String monstruos="";
        String hechizos="";
        String trampas="";
        String tipo = "";
        String nombre = "";
        Iterator it = listaCartas.entrySet().iterator(); 
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            nombre = (String) e.getKey();
            tipo = (String) e.getValue();
            if (tipo.equals("Monstruo")) {
                    
                    monstruos += tipo+ " | "+nombre+ "\n";
                    
                } else if (tipo.equals("Hechizo")) {
                    
                    hechizos += tipo+ " | "+nombre+ "\n";                    
                    
                } else if (tipo.equals("Trampa")) {
                    
                    trampas += tipo+ " | "+nombre+ "\n";
                }      
        }
        lista = monstruos + hechizos + trampas;
        return lista;
    }
    
    public void imprimirTodas(){
        
        for (Map.Entry<String, String> i :  listaCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            System.out.println(key + " | " + value);
            
        }        
    }
    public void imprimirLista(){
        for (Map.Entry<String, String> i :  listaCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            System.out.println(key + " | " + value);
    }
}
}

/**
 * Objeto tipo carta
 * Algoritmos y estructuras de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Andres Urizar - 17632
 * @version: 9/03/18
 */
package hojadetrabajo6;

public class Cartas {
    private String nombre;
    private String tipo;
    
    public Cartas(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre + " | " + tipo;
    }
    
    /**
     * Imprime las cortas por tipo.
     * @return: El string de las cartas
     */
    public String porTipo(){
        return tipo + " | " + nombre;
    }
    
    
}

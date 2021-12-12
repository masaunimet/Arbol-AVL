
package PruebaCortaII;

import javax.swing.JPanel;

/**
 * Simula un arbol binario de busqueda
 * @author Yoselyn Morle y Tony Cunsolo
 */

public class SimuladorArbolBinario {

    ArbolBB miArbol = new ArbolBB();

    /**
     * Constructor del Simulador
     */
    public SimuladorArbolBinario() {
    }
 
    /**
     * Inserta el dato en el Arbol
     * @param dato: dato de tipo entero, elemento a insertar en el arbol
     * @return Dato de tipo booleano, Verdadero si se inserto, Falso si el elemento esta repetido
     */
    public boolean Insertar(int dato) {
        
        miArbol.setRaiz(miArbol.Insertar(miArbol.getRaiz(), dato));
        
        if (miArbol.isElemRepetido()) {
            return false;
        }
        return true;
    }
    
    /**
     * Elimina el dato en el Arbol
     * @param dato: dato de tipo entero, elemento a eliminar del arbol
     * @return Dato de tipo booleano, Verdadero al ser eliminado
     */
    public boolean Eliminar(int dato){
    
        miArbol.Delete(dato, miArbol.getRaiz());
        
        if (dato == miArbol.getRaiz().getDato()) {
            
            miArbol.setRaiz(null);
        }
        
        return true;
    }
    

    /**
     * Obtiene el dibujo del arbol
     * @return
     */
    public JPanel getDibujo() {
        
        return this.miArbol.getdibujo();
    }
    
    /**
     * Vacia el arbol existente
     */
    public void NuevoSimulador(){
        
        miArbol.setRaiz(null);
    }
}


package PruebaCortaII;

/**
 * Construye los nodos que forman el arbol
 * @author Yoselyn Morle y Tony Cunsolo
 */
public class Nodo {
    private int dato;
    private Nodo izq,der;
    private int alt;

    // Constructor

    /**
     *
     * @param dato: dato de tipo entero, elemento que va a contener el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
        this.alt = 1;
    }

    // Getters and Setters

    /**
     *
     * @return elemento que contiene el nodo
     */
    public int getDato() {
        return dato;
    }

    /**
     *
     * @param dato: dato de tipo entero, elemento que contiene el nodo
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     *
     * @return dato de tipo Nodo
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     *
     * @param izq: dato de tipo Nodo, nodo izquierdo
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    /**
     *
     * @return dato de tipo Nodo
     */
    public Nodo getDer() {
        return der;
    }

    /**
     *
     * @param der: dato de tipo Nodo, nodo derecho
     */
    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     *
     * @return Altura del nodo
     */
    public int getAlt() {
        return alt;
    }

    /**
     *
     * @param alt: dato de tipo entero
     */
    public void setAlt(int alt) {
        this.alt = alt;
    }
 
    
    
}

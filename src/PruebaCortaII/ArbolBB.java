
package PruebaCortaII;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * Construye un arbol binario de busqueda
 * @author Yoselyn morle y Tony Cunsolo
 */

public class ArbolBB {

    // Atributos
    private Nodo raiz;
    private int altura;
    private boolean elemRepetido;
    
    
    /**
     * Constructor del Arbol Binario de Busqueda
     */
    public ArbolBB() {
        
        raiz = null;
        altura = 0;
        elemRepetido = false;
    }
    
    // Getters and Setters


    /**
     * 
     * @return Devuelve la Raiz del Arbol
     */
    public Nodo getRaiz() {
        return raiz;
    }
    
    /**
     * Modifica la Raiz del arbol
     * @param raiz: dato de tipo Nodo
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    /**
     *
     * @return Devuelve la altura del arbol
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Modifica la altura del arbol
     * @param altura: dato de tipo entero
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     *
     * @return Devuelve el valor de elemRepetido
     */
    public boolean isElemRepetido() {
        return elemRepetido;
    }

    /**
     * Modifica el atributo elemRepetido
     * @param elemRepetido: dato de tipo Booleano
     */
    public void setElemRepetido(boolean elemRepetido) {
        this.elemRepetido = elemRepetido;
    }
    
    
    
    // Funciones y Metodos
    
    /**
     * Devuelve la altura del arbol
     * @param n: dato de tipo Nodo
     * @return Altura del Nodo en cuestion
     */
    int Altura(Nodo n) { 
        if (n == null) 
            return 0; 
  
        return n.getAlt(); 
    } 
  
    /**
     * Funcion que devuelve el maximo de dos enteros 
     * @param a: dato de tipo entero que es contenido por uno de los Nodos del arbol
     * @param b: dato de tipo entero que es contenido por uno de los Nodos del arbol
     * @return El numero mayor entre ambos parametros
     */
    int Max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
  
    /**
     * Funcion para rotar el subArbol de raiz y
     * @param y: dato de tipo Nodo que va a ser rotado
     * @return La nueva raiz
     */
    public Nodo RotacionDerecha(Nodo y) { 
        Nodo x = y.getIzq(); 
        Nodo T2 = x.getDer(); 
  
        // Realiza la rotacion 
        x.setDer(y); 
        y.setIzq(T2); 
  
        // Actualiza las alturas 
        y.setAlt(Max(Altura(y.getIzq()), Altura(y.getDer())) + 1); 
        x.setAlt(Max(Altura(x.getIzq()), Altura(x.getDer())) + 1); 
  
        // Devuelve la nueva raiz 
        return x; 
    } 
  
    /**
     * Funcion para rotar el subArbol de raiz x
     * @param x: dato de tipo Nodo que va a ser rotado
     * @return La nueva raiz
     */
    public Nodo RotacionIzquierda(Nodo x) { 
        Nodo y = x.getDer(); 
        Nodo T2 = y.getIzq(); 
  
        // Realiza la rotacion 
        y.setIzq(x); 
        x.setDer(T2); 
  
        // Actualiza las alturas 
        x.setAlt(Max(Altura(x.getIzq()), Altura(x.getDer())) + 1); 
        y.setAlt(Max(Altura(y.getIzq()), Altura(y.getDer())) + 1); 
  
        // Devuelve la nueva raiz  
        return y; 
    } 
  
    /**
     * Obtiene el factor de balance del nodo n 
     * @param n: dato de tipo nodo contenido en el arbol
     * @return Dato de tipo entero
     */
    public int getBalance(Nodo n) { 
        if (n == null) 
            return 0; 
  
        return Altura(n.getIzq()) - Altura(n.getDer()); 
    } 
  
    /**
     * Inserta un nodo nuevo al arbol manteniendo la condicion de equilibrio en el arbol
     * @param nodo: dato de tipo Nodo, raiz del arbol
     * @param key: dato de tipo entero que se quiere insertar en el arbol
     * @return Dato de tipo Nodo que contiene el dato que se quiere insertar
     */
    public Nodo Insertar(Nodo nodo, int key) { 
  
        this.setElemRepetido(false);
        
        // 1.  Inserta normalmente 
        if (nodo == null){
        
            return (new Nodo(key));
        } 
  
        if (key < nodo.getDato()){
        
            nodo.setIzq(Insertar(nodo.getIzq(), key)); 
        }   
        else if (key > nodo.getDato()){
        
            nodo.setDer(Insertar(nodo.getDer(), key)); 
        }  
        else{
            // No se permiten datos duplicados 
            this.setElemRepetido(true);
            JOptionPane.showMessageDialog(null, "El dato ingresado ya existe", " ...", 1);
            return nodo;
        } 
            
        // 2. Actualiza la altura del nodo anterior 
        nodo.setAlt(1 + Max(Altura(nodo.getIzq()), Altura(nodo.getDer()))); 
  
        // 3. Obtiene el factor de balance de su nodo antecesor para verificar si el nodo quedo desBalanceado
        int balance = getBalance(nodo); 
  
        // Si el nodo quedo desbalanceado se verifican los siguientes casos 
        // Caso Izquierdo Izquierdo 
        if (balance > 1 && key < nodo.getIzq().getDato()){
        
            return RotacionDerecha(nodo); 
        }
        // Caso Derecho Derecho 
        if (balance < -1 && key > nodo.getDer().getDato()){
        
            return RotacionIzquierda(nodo);
        }
        // Caso Izquierdo Derecho 
        if (balance > 1 && key > nodo.getIzq().getDato()) { 
            nodo.setIzq(RotacionIzquierda(nodo.getIzq()));
            return RotacionDerecha(nodo); 
        }
        // Caso Derecho Izquierdo 
        if (balance < -1 && key < nodo.getDer().getDato()) { 
            nodo.setDer(RotacionDerecha(nodo.getDer())); 
            return RotacionIzquierda(nodo); 
        }
        // Devuelve el nodo sin ser cambiado
        return nodo; 
    }
    
    /**
     * Elimina un nodo existente manteniendo la condicion de equilibrio en el arbol
     * @param Elem: dato de tipo entero que se quiere eliminar
     * @param nodo: dato de tipo Nodo, raiz del arbol
     * @return Dato de tipo Nodo
     */
    public Nodo Delete(int Elem, Nodo nodo){
        
        Nodo resp = nodo;
        
        if (Elem < nodo.getDato()) {
                
            nodo.setIzq(Delete(Elem,nodo.getIzq()));
        }
            
        else{
                
            if(Elem > nodo.getDato()){
                    
                nodo.setDer(Delete(Elem,nodo.getDer()));
            }
                
            else{
                    
                if(nodo.getDer()!= null && nodo.getIzq()!= null){
                        
                    Nodo temp=nodo;
                    Nodo Max_Izq =Max(nodo.getIzq());
                    nodo.setDato(Max_Izq.getDato());
                    temp.setIzq(Delete(Max_Izq.getDato(),temp.getIzq()));
                }
                    
                else{
                        
                    if(nodo.getIzq()!=null){
                                
                        resp=nodo.getIzq();
                    }
                            
                    else{
                                
                        if(nodo.getDer()!=null){
                                    
                            resp=nodo.getDer();
                        }
                                
                        else{
                                    
                            resp=null;
                        }
                    }
                }
            }
        }
            
        return resp;
    }
    /**
     * Obtiene el nodo Maximo en el arbol
     * @param n: dato de tipo nodo contenido en el arbol
     * @return Nodo maximo en el arbol
     */
    private Nodo Max(Nodo n) {
            
        if (n.getDer() == null) {
                
            return n;
        } 
            
        return Max(n.getDer());
    }
    
    /**
     * Dibuja en la interfaz
     * @return Estructura Arbol dibujado 
     */
    public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
    
}

package MEDICIONES.EstructurasAVLTree;

/**
 * Clase que se encarga de los datos correspondientes al nodo de un árbol
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramírez
 */
public class Nodo {

    private int dato; // dato del nodo
    private Nodo izq; //  hijo izquierdo
    private Nodo der; // hijo derecho
    private int peso; // el peso del nodo

    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
        peso = 0;
    }

    /**
     * Constructor sobrecargado que asigna valores por defecto a los hijos de un
     * nodo
     *
     * @param dato recibe el dato o valor del nodo
     */
    public Nodo(int dato) {
        this(dato, null, null);
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

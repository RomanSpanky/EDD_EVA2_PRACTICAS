
public class Nodo {

    private int dato; //Valor
    private Nodo siguiente; //Referencia
    private Nodo previo;

    //Constructores
    public Nodo() {//Default
        this.siguiente = null;
        this.previo = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    //Getter y setter
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    public Nodo getPrevio() {
        return previo;
    }
}

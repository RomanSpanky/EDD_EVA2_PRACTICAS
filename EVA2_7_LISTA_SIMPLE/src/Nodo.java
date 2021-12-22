
public class Nodo {

    private int dato;
    private Nodo siguiente;
    //Constructores

    public Nodo() {//Default
        this.siguiente = null;
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

}

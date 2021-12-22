
public class Nodo {

    private int dato;//valor
    private Nodo izquierda; //Referencia
    private Nodo derecha;

    //Constructores
    public Nodo() {//Default
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.derecha = null;
    }

    //Getter y setter
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getderecha() {
        return derecha;
    }

    public Nodo getizquierda() {
        return izquierda;
    }

    public void setderecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void setizquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}

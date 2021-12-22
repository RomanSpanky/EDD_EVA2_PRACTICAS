
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null; //Arbol vacío
    }

    //Todo recursivo
    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        //Verificar si hay nodos
        if (root == null) {//Árbol vacío
            root = nuevo;  //Arbol sin fin
        } else {
            //Método recursivo
            addRecu(root, nuevo);

        }
    }

    private void addRecu(Nodo actual, Nodo nuevo) {
        //Verificar sentido del nodo
        if (nuevo.getDato() < actual.getDato()) { //Izquierdo nuevo mayor a actual
            if (actual.getizquierda() == null) {//Si hay espacio aquí se inserta el nodo nuevo 
                actual.setizquierda(nuevo);
            } else {//Llamar al método recursivo
                addRecu(actual.getizquierda(), nuevo);
            }
        } else if (nuevo.getDato() > actual.getDato()) {  //Derecha
            if (actual.getderecha() == null) {//Si hay espacio aquí se inserta el nodo nuevo
                actual.setderecha(nuevo);
            } else {
                addRecu(actual.getderecha(), nuevo);
            }
        } else {
            System.out.println("El valor ya existe en el árbol");
        }
    }

    //Imprimir nodos del arbol
    public void printPreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Nodo actual) {
        if (actual != null) {
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE
            PreOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            PreOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE

        }
    }

    public void printPostOrder() {
        PostOrder(root);
    }

    private void PostOrder(Nodo actual) {
        if (actual != null) {
            PostOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            PostOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE

        }

    }

    public void printInOrder() {
        InOrder(root);
    }

    private void InOrder(Nodo actual) {
        if (actual != null) {
            InOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE
            InOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE

        }

    }

}


public class MyQueue extends Lista {

//LIFO
//Los elementos se agregan al final de la lista --> Método ADD
//Sólo se puede acceder a los elementos al inicio de la lista
    public int peek() throws Exception { //Regresa el valor del elemento al inicio de la lista
        return get(0);
    }

    public int poll() throws Exception {
        //Guardar
        int iVal = get(0);
        //Eliminar
        deleteAt(0);
//Enviar el valor
        return iVal;

    }

}


public class MyStack extends Lista {

    public int peek() throws Exception {
        return get(4);
    }

    public int pop() throws Exception {
        //Guardar
        int iVal = get(4);
        //Eliminar 
        deleteAt(4);
//Enviar el valor
        return iVal;
    }

}

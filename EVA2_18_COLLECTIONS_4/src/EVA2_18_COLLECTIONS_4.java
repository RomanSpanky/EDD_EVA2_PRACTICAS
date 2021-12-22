
import java.util.LinkedHashSet;
import java.util.Set;


public class EVA2_18_COLLECTIONS_4 {


    public static void main(String[] args) {
        //Conjuntos
        //No tiene elementos que se repitan
        Set<Integer> conjunto = new LinkedHashSet<>();
        //Se omiten únicamente en la impresión los valores repetidos
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        System.out.println(conjunto);
    }
    
}

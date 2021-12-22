
import java.util.LinkedList;

public class EVA2_12_COLLECTIONS_1 {

    public static void main(String[] args) {
        //Creamos la linked list
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);

    }

}

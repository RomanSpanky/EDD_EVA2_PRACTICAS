
public class EVA2_2_FOR_RECURSIVO_2 {

    public static void main(String[] args) {

        fakeForDown(5);
    }

    public static void fakeForDown(int iVal) {
        System.out.print(iVal + " - ");
        if (iVal > 1) {
            fakeForDown(iVal - 1);//Esto es lo que debemos controlar
        }

    }

}

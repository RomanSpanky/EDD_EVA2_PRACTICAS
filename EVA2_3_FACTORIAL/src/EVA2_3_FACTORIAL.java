
public class EVA2_3_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + factorial(5));
    }

    public static int factorial(int iVal) {
        if (iVal == 0) {
            return 1;
        } else {
            return iVal * factorial(iVal - 1);
        }
    }

    public static int factorialFor(int iVal) {
        int iTemp = 0;
        for (int i = iVal; i < 0; i++) {
            iTemp = iTemp + i;

        }
        return iTemp;
    }
}

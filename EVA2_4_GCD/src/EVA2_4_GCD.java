
public class EVA2_4_GCD {

    public static void main(String[] args) {

        System.out.println("El MCD de 180 y 48 es: " + gcd(180, 48));
    }

    public static int gcd(int iDividendo, int iDivisor) {
        if (iDivisor == 0)//Detenemos
        //¿Cómo calculamos residuo?
        //Módulo --> %
        {
            return iDividendo;
        } else {
            int iResi = iDividendo % iDivisor;
            return gcd(iDivisor, iResi);
            //¿Cómo hacemos al método recursivo?

        }
    }

}

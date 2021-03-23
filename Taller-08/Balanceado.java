public class Balanceado {
    public static boolean balancear(int a[]) {
        int principio = 0, fin = 0;
        for (int i = 0, j = a.length - 1; i < a.length/2; i++, j--) {
            principio+=a[i];
            fin+=a[j];
        }
        return principio == fin;
    }
}
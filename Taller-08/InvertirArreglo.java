public class InvertirArreglo {
    public static int[] invertir(int a[]) {
        int invertido[] = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            invertido[i] = a[j];
        }
        return invertido;
    }

    public static void imprimir(int a[]) {
        int j = 0;
        for (int i : a) {
            System.out.print(i);
            if (j != a.length - 1)
                System.out.print(",");
            j++;
        }
    }
}

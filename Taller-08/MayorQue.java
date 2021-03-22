public class MayorQue {
    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 2, 1 };
        mayor(a);
    }

    public static void mayor(int a[]) {
        int num = a[0];
        boolean mayores = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > num) {
                System.out.println(a[i]);
                mayores = true;
            }
        }
        if (!mayores)
            System.out.println("No hay ningun numero mayor que el primero");
    }
}
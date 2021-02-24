import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int acumulador = 0;
        for (int i = 0; i < n; i++) {
            int numero = teclado.nextInt();
            if (numero % 2 == 0)
                acumulador += numero;
        }
        System.out.println(acumulador);
    }
}

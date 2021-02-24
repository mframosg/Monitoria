import java.util.Scanner;

public class Multiplos5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        for (int i = 5; i <= num; i += 5) {
            System.out.println(i);
        }
    }
}

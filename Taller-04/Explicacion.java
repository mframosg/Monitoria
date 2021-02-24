import java.util.Scanner;
public class Explicacion{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        for (int i = 5; i <= a; i+=5) {
            System.out.println(i);
        }
    }
}
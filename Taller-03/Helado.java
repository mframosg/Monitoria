import java.util.Scanner;

public class Helado{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int temperatura = teclado.nextInt();
        if (temperatura > 27) {
            System.out.println("Comprar helado cerveza");
        }
    }
}
import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int celsius = teclado.nextInt();
        double fahrenheit = 9*celsius;
        fahrenheit/=5;
        fahrenheit +=32;
        System.out.println(String.format("%.2f", fahrenheit));
    }
}
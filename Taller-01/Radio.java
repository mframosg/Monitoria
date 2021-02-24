import java.util.Scanner;

public class Radio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, pi , resultado;
        radio = teclado.nextDouble();
        pi = Math.PI;
        resultado = pi * (radio*radio);
        System.out.println(String.format("%.2f", resultado));
    }
}

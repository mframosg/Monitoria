import java.util.Scanner;

public class ContIncrDecr {
    public static void main(String[] args) {
        double variable = 0.0;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        while (true) {
            double comparacion = variable;
            variable = teclado.nextDouble();
            if (variable == 0)
                break;
            if ((variable >= comparacion)) {
                contador += 1;
                System.out.println("+1");
            } else {
                contador -= 1;
                System.out.println("-1");
            }
        }
        System.out.println("Contador: " + contador);
    }
}

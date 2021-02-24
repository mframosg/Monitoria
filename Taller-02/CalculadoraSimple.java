import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        CalculadoraSimple calculadora = new CalculadoraSimple();
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        int resultado;
        resultado = calculadora.restar(5, 3);
        System.out.println(resultado);
        System.out.println(calculadora.sumar(num1, num2));
        System.out.println(calculadora.restar(num1, num2));

    }

    public int sumar(int a, int b) {
        return a+b;
    }

    public int restar(int a, int b) {
        return a-b;
    }

}

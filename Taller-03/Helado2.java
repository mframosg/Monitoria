import java.util.Scanner;

public class Helado2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int temperatura = teclado.nextInt();
        int edad = teclado.nextInt();
        if (temperatura > 27 && edad >=18) {
            System.out.println("Comprar helado cerveza");
        }else{ System.out.println("Lo sentimos juventud");}
    }
}
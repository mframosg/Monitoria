import java.util.Scanner;

public class Word{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.next();
        String a = palabra.toLowerCase();
        System.out.println(a.length());
        System.out.println(a.indexOf('a'));
    }
}
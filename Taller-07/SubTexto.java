import java.util.Scanner;

public class SubTexto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = in.next();
        int pInicial = in.nextInt();
        int pFinal = in.nextInt();
        System.out.println(texto.substring(pInicial, pFinal+1));
    }
}

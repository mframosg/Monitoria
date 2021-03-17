import java.util.Scanner;

public class SubTextoMejorado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = in.next();
        int pInicial = in.nextInt();
        int pFinal = in.nextInt();
        if(pFinal > texto.length())
            System.out.println("Error");
        else if (pInicial > pFinal)
            System.out.println("Error2");
        else
            System.out.println(texto.substring(pFinal,pFinal));
    }
}

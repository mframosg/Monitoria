import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cat1, cat2, hipotenusa;
        cat1 = teclado.nextDouble();
        cat2 = teclado.nextDouble();
        hipotenusa = cat1*cat1;
        hipotenusa += cat2*cat2;
        hipotenusa = Math.sqrt(hipotenusa);
        System.out.println(String.format("%.2f", hipotenusa));
    }
}

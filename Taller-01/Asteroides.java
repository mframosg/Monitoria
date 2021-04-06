import java.util.Scanner;

public class Asteroides {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_asteroides;
        String nombre_asteroides;
        numero_asteroides = teclado.nextInt();
        teclado.nextLine();
        nombre_asteroides = teclado.nextLine();
        System.out.println("Los " + numero_asteroides + " asteroides " + nombre_asteroides + " caen del cielo");
    }
}

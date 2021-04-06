import java.util.Scanner;

public class FriendZone {
    public static void main(String[] args) {
        String nombre1, nombre2;
        Scanner teclado = new Scanner(System.in);
        nombre1 = teclado.next();
        nombre2 = teclado.next();
        System.out.println(nombre1 + " deja en la friend zone a " + nombre2);
    }
}

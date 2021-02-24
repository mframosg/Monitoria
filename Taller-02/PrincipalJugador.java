import java.util.Scanner;

public class PrincipalJugador {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Scanner teclado = new Scanner(System.in);
        int salud = teclado.nextInt();
        jugador.setSalud(salud);
        teclado.nextLine();
        String nombre = teclado.nextLine();
        jugador.setNombre(nombre);
        int num2 = teclado.nextInt();
        jugador.reducirSalud(num2);
        int num3 = teclado.nextInt();
        jugador.reducirSalud(num3);
        System.out.print(jugador.getNombre());
        System.out.print(jugador.getSalud());
    }
}

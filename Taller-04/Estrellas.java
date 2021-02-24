import java.util.Scanner;

public class Estrellas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cero = 0, uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, valoracion = 0;
        while (valoracion >= 0) {
            valoracion = teclado.nextInt();

            switch (valoracion) {
                case 0:
                    cero++;
                    break;
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;

            }
        }
        System.out.println("0(" + cero + ") *(" + uno + ") **(" + dos + ") ***(" + tres + ") ****(" + cuatro
                + ") *****(" + cinco + ")");
    }
}

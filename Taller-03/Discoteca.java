import java.util.Scanner;

public class Discoteca {
    public Boolean accesoDiscoteca(int edad, int dinero, String nombre) {
        if (edad >= 18 && dinero >= 100 && (!(nombre.equals("jimmy")))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Discoteca p1 = new Discoteca();
        System.out.println(p1.accesoDiscoteca(17, 100, "Miguel"));
    }
}
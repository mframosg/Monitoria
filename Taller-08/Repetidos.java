import java.util.ArrayList;

public class Repetidos {
    public static int detectorDeRepetidos(ArrayList<Integer> a) {
        int cont = 0;
        boolean sucesion = false;
        for (int i = 0; i < a.size() - 1; i++) {
            if (sucesion) {
                if (a.get(i) != a.get(i + 1))
                    sucesion = false;
            } else if (a.get(i) == a.get(i + 1)) {
                sucesion = true;
                cont++;
            }
        }
        return cont;
    }
}

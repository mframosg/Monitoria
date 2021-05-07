import java.util.function.Function;

public class SumaRecursiva {

    public static void main(String[] args) {
        System.out.println(sumaRecursiva(3));
        Function<Integer, Integer> a = (num) -> {return num <= 0 ? 0 : sumaRecursiva(num - 1) + num;};
        System.out.println(a.apply(4));
    }

    public static int sumaRecursiva(int num) {
        return num <= 0 ? 0 : sumaRecursiva(num - 1) + num;
    }
}
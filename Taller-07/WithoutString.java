import java.util.Scanner;

public class WithoutString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String base = in.next();
        String eliminar = in.next();
        String frase = "";
        if(base.contains(eliminar)){
            frase = base.replace(eliminar, "");
            System.out.println(frase);
        }else
            System.out.println(base);
    }
}

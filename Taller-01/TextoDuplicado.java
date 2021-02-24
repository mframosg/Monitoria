import java.util.Scanner;
public class TextoDuplicado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra =  teclado.nextLine();
        System.out.println(duplicar(palabra));
    }
    
    //Duplicar
    public static String duplicar(String palabra){
        return palabra+palabra;
    }
    
}


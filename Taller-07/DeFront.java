import java.util.Scanner;

public class DeFront {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra = in.next();
        if(palabra.indexOf('a') == 0 && palabra.indexOf('b') == 1){
            System.out.println(palabra);
        }else if(palabra.indexOf('a') == 0){
            System.out.println("a"+palabra.substring(2,palabra.length()));
        }else if(palabra.indexOf('b') == 1){
            System.out.println("b"+palabra.substring(2,palabra.length()));
        }else{
            System.out.println(palabra.substring(2,palabra.length()));
        }
    }
}

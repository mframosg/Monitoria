import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraccionProfesional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = in.nextLine();
        Pattern pattern = Pattern.compile(">(.*?)<");
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find())
            System.out.print(matcher.group(1));
    }
}
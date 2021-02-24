import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception{
        Field field = MascotaSimple.class.getDeclaredField("nombre");
        Field field2 = MascotaSimple.class.getDeclaredField("edad");
        boolean isPrivate = Modifier.isPrivate(field.getModifiers());
        boolean isPrivate2 = Modifier.isPrivate(field2.getModifiers());
        MascotaSimple ms = null;
        if(isPrivate && isPrivate2){
            Scanner entrada = new Scanner(System.in);
            int caso = entrada.nextInt();
            //caso 1 vacío
            if(caso==1){
                ms = new MascotaSimple();
            }else if(caso==2){
                String nombre = entrada.next();
                ms = new MascotaSimple(nombre);
            }else{
                String nombre = entrada.next();
                int edad = entrada.nextInt();
                ms = new MascotaSimple(nombre,edad);
            }
            System.out.println(ms.getNombre());
            System.out.println(ms.getEdad());
        }else{
            System.out.println("Verifica la visibilidad de los atributos");
        }
    }
}
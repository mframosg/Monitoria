import java.util.Scanner;

public class ControlAmbiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorActuador sensor = new SensorActuador(5, 1, 10);
        for (int i = 0; i < 4; i++) {
            int numero = scanner.nextInt();
            if(i <= 1)
                sensor.disminuirTemp(numero);
            else
                sensor.aumentarTemp(numero);
        }
        System.out.println(sensor.getTemperatura());
    }

}


public class SensorActuador {

    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public SensorActuador(int temp, int min, int max) {
        temperatura = temp;
        minTemp = min;
        maxTemp = max;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void disminuirTemp(int i) {
        if ((temperatura - i) >= minTemp)
            temperatura -= i;
    }

    public void aumentarTemp(int i) {
        if ((temperatura + i) <= maxTemp)
            temperatura += i;
    }
}
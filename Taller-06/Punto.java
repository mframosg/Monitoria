public class Punto {
    private double X;
    private double Y;

    public Punto(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double n) {
        this.X = n;
    }

    public void setY(double n) {
        this.Y = n;
    }

    public static double distancia(Punto punto1, Punto punto2) {
        double a;
        double cuadradox;
        double cuadradoy;
        cuadradox = Math.pow(((punto2.X) - (punto1.X)), 2);
        cuadradoy = Math.pow(((punto2.Y) - (punto1.Y)), 2);
        a = Math.sqrt((cuadradox) + (cuadradoy));
        return a;
    }
}
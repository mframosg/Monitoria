public class Planeta {
    private String nombre;
    private double masa;
    public int contador = 0;

    public Planeta() {
        this("Tierra", 5.972);
    }

    public Planeta(String n, double m) {
        this.nombre = n;
        this.masa = m;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setMasa(double m) {
        this.masa = m;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public static Planeta planetaMedio(Planeta p) {
        Planeta astro = new Planeta();
        astro.setNombre(p.nombre);
        astro.setMasa((p.masa) / 2);
        return astro;
    }

}

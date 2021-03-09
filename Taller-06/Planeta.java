
public class Planeta{

    private String nombre;
    private double masa;
    public int contador = 0;

    public Planeta(){
        new Planeta("tierra",5.972);
    }
    public Planeta(String n, double m){
        this.nombre = n;
        this.masa = m;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public Planeta planetaMedio(Planeta p){
        Planeta p1 = new Planeta(nombre,masa/2);
        return p1;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta();
        Planeta p2 = p1.planetaMedio(p1);
        System.out.println(p2.getNombre() + p2.getMasa());
    }
}

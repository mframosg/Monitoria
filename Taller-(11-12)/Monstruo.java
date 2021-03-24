public class Monstruo {
    private String nombre;
    private int sangre;

    public Monstruo(String nombre, int sangre) {
        this.nombre = nombre;
        this.sangre = sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSangre() {
        return sangre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSangre(int sangre) {
        this.sangre = sangre;
    }
}

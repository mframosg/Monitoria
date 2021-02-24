public class Jugador {
    
    
    private String nombre;
    private int salud;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    public int getSalud() {
        return salud;
    }

    public void reducirSalud(int valor) {
        this.salud -=valor;
    }

}

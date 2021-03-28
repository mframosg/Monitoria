public class Orco1 extends Monstruo1 {
    private String grunyido;

    public Orco1(String nombre, int sangre, String grunyido) {
        super(nombre, sangre);
        this.grunyido = grunyido;
    }

    public void imprimirNombre() {
        System.out.println(getNombre());
    }

    public void setGrunyido(String grunyido) {
        this.grunyido = grunyido;
    }

    public String getGrunyido() {
        return grunyido;
    }

    @Override
    public void moverse() {
        System.out.println("Soy un orco, estoy corriendo " + getNombre());
    }
}
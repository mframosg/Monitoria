public class Orco extends Monstruo {
    private String grunyido;

    public Orco(String nombre, int sangre, String grunyido) {
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
}
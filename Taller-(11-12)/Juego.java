public class Juego {
    private Monstruo1[] monstruos;

    public Juego() {
        monstruos = new Monstruo1[4];
        monstruos[0] = new Orco1("Garnag", 10, "grrr");
        monstruos[1] = new Dragon("Brenton", 20, "metal");
        monstruos[2] = new Orco1("Rogthun", 5, "purr");
        monstruos[3] = new Dragon("Shenlong", 40, "cuero");
    }

    public void moverMonstruos() {
        for (int i = 0; i < monstruos.length; i++) {
            monstruos[i].moverse();
        }
    }
}
public class ContadorSimple {
    private int conteo = 1;
    
    public void aumentar() {
        conteo+=1;
    }

    public void disminuir() {
        conteo-=1;
    }

    public int getConteo() {
        return conteo;
    }

}

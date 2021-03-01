public class Array {
    public static void recorrerArray(int[] array, int indice) {
        //if vacio
        if (!(indice >= array.length)) {
            System.out.println(array[indice]);
            recorrerArray(array, indice + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5 };
        recorrerArray(array, 0);
    }
}

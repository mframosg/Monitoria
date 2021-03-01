public class Array1 {
    public static void main(String[] args) {
        int arr[][] = { { 8, 20, 18 }, { 6, 5, 7 }, { 8, 4, 5 } };
        System.out.println(minimoBuscado(arr));
    }

    public static int minimoBuscado(int[][] arr) {
        int cont = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] <= cont)
                    cont = arr[i][j];
            }
        }
        return cont;
    }
}

public class Array2 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
        transpuesta(arr);
    }

    public static void transpuesta(int arr[][]) {
        int[][] a = new int[arr[0].length][arr.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = arr[j][i];
            }
        }
        for (int[] is : a) {
            for (int is2 : is) {
                System.out.print(is2 + "\t ");
            }
            System.out.println();
        }
    }
}

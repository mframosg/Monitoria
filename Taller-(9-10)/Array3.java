public class Array3 {
    public static int sumaDiagonal(int a[][]){
        int result = 0;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == j)
                    result+= a[i][j];
            }
        }
        return result;
    }
}

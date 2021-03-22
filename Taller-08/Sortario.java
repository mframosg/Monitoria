public class Sortario {
    public static boolean detectorDeMalaSuerte(int a[]) {
        boolean flag13 = false, flag1 = false, flag3 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3)
                flag3 = true;
            else if (a[i] == 1)
                flag1 = true;
            else if (a[i] == 13)
                flag13 = true;

        }
        return (flag1 && flag3) || flag13 ;
    }
}

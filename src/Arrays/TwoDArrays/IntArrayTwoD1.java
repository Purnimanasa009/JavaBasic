package Arrays.TwoDArrays;

public class IntArrayTwoD1 {
    public static void main(String[]args) {
        int[][] a = new int[4][3];
        a[0][0] = 3;
        a[0][1] = 29;
        a[0][2] = 32;

        a[1][0] = 3;
        a[1][1] = 29;
        a[1][2] = 32;

        a[2][0] = 30;
        a[2][1] = 209;
        a[2][2] = 322;

        a[3][0] = 13;
        a[3][1] = 289;
        a[3][2] = 35;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }

    }
}
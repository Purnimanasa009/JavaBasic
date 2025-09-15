package Arrays.TwoDArrays;

public class IntArrayTwoDNewWay {
    public static void main(String[]args) {
        int[][] a = {
            {12,14,32},
            {43,24,42},
            {42,42,64},
        };

        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }

    }
}
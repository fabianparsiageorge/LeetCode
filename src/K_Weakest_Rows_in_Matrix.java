import java.util.Arrays;

public class K_Weakest_Rows_in_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[] finalArr = kWeakestRows(mat, k);
        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] myArr = new int[mat.length][2];
        int[] finalArr = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    onesCount++;
                }
            }
            myArr[i][0] = i;
            myArr[i][1] = onesCount;
        }
        Arrays.sort(myArr, (a, b) -> a[1] - b[1]);

        for (int i = 0; i < k; i++) {
            finalArr[i] = myArr[i][0];
        }

        return finalArr;
    }
}

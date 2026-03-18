package level4;

import java.util.Arrays;

public class code_88 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr2[0].length];

        int n = arr1.length;
        int m = arr1[0].length;
        int p = arr2[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < p; k++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] result = solution(arr1, arr2);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

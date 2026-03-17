package level4;

import java.util.Arrays;

public class code_87 {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];

        for(int i = 0; i < answer.length; i++) {
            long row = left / n;
            long col = left % n;
            left++;

            answer[i] = (int) Math.max(row, col) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        int left = 7;
        int right = 14;
        System.out.println(Arrays.toString(solution(n, left, right)));
    }
}

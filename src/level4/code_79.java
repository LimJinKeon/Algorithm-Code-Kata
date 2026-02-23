package level4;

import java.util.Arrays;

public class code_79 {
    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for(int height = 3; height <= Math.sqrt(total); height++) {
            if (total % height == 0) {
                int width = total / height;

                if ((height - 2) * (width - 2) == yellow) {
                    return new int[] {width, height};
                }
            }
        }
        return new int[] {brown, yellow};
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }
}

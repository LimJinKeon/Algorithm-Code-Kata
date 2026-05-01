package level5;

import java.util.Arrays;

public class code_98 {

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(solution(numbers)));
    }
}

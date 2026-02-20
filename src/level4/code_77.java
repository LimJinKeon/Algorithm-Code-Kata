package level4;

import java.util.Arrays;

public class code_77 {
    public static int[] solution(String s) {
        int[] answer = {0, 0};

        while(!s.equals("1")) {
            int beforeLen = s.length();
            answer[1] += beforeLen - s.replace("0", "").length();

            s = Integer.toBinaryString(s.replace("0", "").length());
            answer[0]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));
    }
}

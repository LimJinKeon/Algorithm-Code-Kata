package level4;

import java.util.Arrays;

public class code_86 {
    public static int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 논문 포함 뒤쪽 논문 개수
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}

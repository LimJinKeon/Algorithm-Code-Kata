package level4;

import java.util.HashMap;
import java.util.Map;

public class code_89 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for(int i = 0; i < discount.length - 9; i++) {
            for(int j = 0; j < want.length; j++) {
                wantMap.put(want[j], number[j]);
            }

            for(int k = 0; k < 10; k++) {
                String item = discount[i + k];
                if (wantMap.containsKey(item)) {
                    wantMap.put(item, wantMap.get(item) - 1);
                }
            }

            boolean isMatch = true;
            for (int value : wantMap.values()) {
                if (value != 0) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String [] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }
}

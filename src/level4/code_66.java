package level4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code_66{
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> key = new HashMap<>();

        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                key.put(s.charAt(i), Math.min(key.getOrDefault(s.charAt(i), Integer.MAX_VALUE), i + 1));
            }
        }

        for (int j = 0; j < targets.length; j++) {
            String t = targets[j];
            int sum = 0;

            for(int k = 0; k < t.length(); k++) {
                if(!key.containsKey(t.charAt(k))) {
                    sum = -1;
                    break;
                }
                sum += key.get(t.charAt(k));
            }
            answer[j] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}

package level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code_71 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int todayToInt = toDays(today);

        for (String term : terms) {
            String[] arr = term.split(" ");
            termMap.put(arr[0], Integer.parseInt(arr[1]));
        }


        for (int i = 0; i < privacies.length; i++) {
            int collectedDay = toDays(privacies[i].substring(0, 10));
            int e = termMap.get(privacies[i].substring(11));
            int expireDate = collectedDay + e * 28;

            if (expireDate <= todayToInt) {
                result.add(i + 1);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static int toDays(String date) {
        String[] arr = date.split("\\.");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        return year * 12 * 28 + month * 28 + day;
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }
}

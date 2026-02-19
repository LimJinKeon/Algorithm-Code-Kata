package level4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code_73 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        Map<Character, int[]> move = new HashMap<>();
        move.put('E', new int[]{0, 1});
        move.put('W', new int[]{0, -1});
        move.put('S', new int[]{1, 0});
        move.put('N', new int[]{-1, 0});

        for (int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");
            char direction = parts[0].charAt(0);
            int distance = Integer.parseInt(parts[1]);

            int dRow = move.get(direction)[0];
            int dCol = move.get(direction)[1];
            int startRow = answer[0];
            int startCol = answer[1];

            for (int i = 1; i <= distance; i++) {
                int x = answer[0] + dRow;
                int y = answer[1] + dCol;

                if (x >= park.length || y >= park[0].length() || park[x].charAt(y) == 'X') {
                    answer[0] = startRow;
                    answer[1] = startCol;
                    break;
                }

                answer[0] = x;
                answer[1] = y;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }
}

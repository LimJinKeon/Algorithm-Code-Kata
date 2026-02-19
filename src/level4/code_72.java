package level4;

import java.util.Arrays;
import java.util.HashMap;

public class code_72 {
    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int rank = map.get(calling);
            String front = players[rank - 1];

            players[rank] = front;
            players[rank - 1] = calling;

            map.put(front, rank);
            map.put(calling, rank - 1);
        }
        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }
}

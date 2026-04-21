package level5;

import java.time.LocalTime;
import java.util.*;

public class code_96 {

    public static int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();     // 입차 시간
        Map<String, Integer> totalMap = new HashMap<>();  // 누적 시간

        // 누적 주차 시간 계산
        for (String record : records) {
            String[] s = record.split("\\s");
            LocalTime time = LocalTime.parse(s[0]);
            int totalMinutes = time.getHour() * 60 + time.getMinute();

            if (s[2].equals("IN")) {
                inMap.put(s[1], totalMinutes);
            } else {
                totalMap.put(s[1], totalMap.getOrDefault(s[1], 0) + (totalMinutes - inMap.getOrDefault(s[1], 0)));
                inMap.remove(s[1]);
            }
        }

        // 마지막 OUT 없을 시 23:59으로 계산
        inMap.forEach((car, inMinutes) -> {
            int minute = 23 * 60 + 59;
            totalMap.put(car,
                    totalMap.getOrDefault(car, 0) + (minute - inMinutes)
            );
        });

        // 차 번호 오름차순 정렬
        TreeMap<String, Integer> sortedMap = new TreeMap<>(totalMap);

        // 주차료 계산
        int[] answer = new int[sortedMap.size()];
        int idx = 0;
        for (int value : sortedMap.values()) {
            if (value <= fees[0]) {
                answer[idx++] = fees[1];
            } else {
                int extraFee = (value - fees[0] + fees[2] - 1) / fees[2] * fees[3];
                answer[idx++] = fees[1] + extraFee;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};
        System.out.println(Arrays.toString(solution(fees, records)));
    }
}

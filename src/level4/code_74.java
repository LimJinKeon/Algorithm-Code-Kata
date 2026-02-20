package level4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class code_74 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        int[] answer = new int[id_list.length];

        // 신고 당한 횟수를 저장할 Map
        for(String user : id_list) {
            count.put(user, 0);
        }
        // 신고당한 유저와 신고한 유저 Map
        for(String user : id_list) {
            reportMap.put(user, new HashSet<>());
        }

        for(String user : report) {
            String[] arr = user.split(" ");
            // 해당 유저에게 처음 신고당할 경우 카운트 증가
            if(!reportMap.get(arr[1]).contains(arr[0])) {
                count.put(arr[1], count.get(arr[1]) + 1);
            }
            // 신고 기록 저장(muzi -> frodo)
            reportMap.get(arr[1]).add(arr[0]);
        }

        // 정지될 유저 확인
        for(String user : id_list) {
            if(count.get(user) >= k) {
                for(int i = 0; i < id_list.length; i++) {
                    if(reportMap.get(user).contains(id_list[i]))
                        answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }
}

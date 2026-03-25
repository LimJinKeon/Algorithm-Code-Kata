package level4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class code_92 {
    public static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int p : priorities) {
            queue.offer(p);
            pq.offer(p);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == pq.peek()) {
                answer++;
                pq.poll();

                if (location == 0) {
                    return answer;
                }
            } else {
                queue.offer(current);
            }

            location = (location == 0) ? queue.size() - 1 : location - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities, location));
    }
}

package level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code_91 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();

        int currentDeployDay = getRequiredDays(progresses[0], speeds[0]);
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {
            int requiredDay = getRequiredDays(progresses[i], speeds[i]);

            if (requiredDay <= currentDeployDay) {
                count++;
            } else {
                result.add(count);
                currentDeployDay = requiredDay;
                count = 1;
            }
        }

        result.add(count);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int getRequiredDays(int progress, int speed) {
        return (100 - progress + speed - 1) / speed;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}

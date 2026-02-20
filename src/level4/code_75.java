package level4;

import java.util.Arrays;

public class code_75 {
    public static String solution(String s) {
        int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return min + " " + max;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
}

import java.util.Arrays;

public class code_47 {
    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.stream(solution(strings, n)).toList());
    }
}

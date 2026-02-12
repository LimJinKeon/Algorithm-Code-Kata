package level4;

public class code_65 {
    public static int solution(String s) {
        int answer = 0;
        int x = 0;
        int y = 0;
        char first = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (x == 0) {
                first = s.charAt(i);
            }

            if (s.charAt(i) == first) x++;
            else y++;

            if (x == y) {
                answer++;
                x = 0;
                y = 0;
            }
        }

        if (x != 0) answer++;

        return answer;
    }

    public static void main(String[] args) {
        String s = "aaabbaccccabba";
        System.out.println(solution(s));
    }
}

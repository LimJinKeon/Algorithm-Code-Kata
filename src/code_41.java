public class code_41 {
    public static String solution(String s) {
        String answer = "";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += c;
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
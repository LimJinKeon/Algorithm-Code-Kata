package level4;

public class code_75 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirst = true;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(" ");
                isFirst = true;
            }
            else {
                if (isFirst) {
                    answer.append(Character.toUpperCase(s.charAt(i)));
                    isFirst = false;
                }
                else {
                    answer.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
}

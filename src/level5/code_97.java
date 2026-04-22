package level5;

public class code_97 {

    static String[] words = {"A", "E", "I", "O", "U"};
    static int count = 0;
    static int answer = 0;

    public static int solution(String word) {
        dfs("", word);
        return answer;
    }

    private static void dfs(String current, String target) {
        if (target.equals(current)) {
            answer = count;
            return;
        }

        if (current.length() == 5) return;

        for (int i = 0; i < 5; i++) {
            count++;
            dfs(current + words[i], target);
        }
    }

    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }
}

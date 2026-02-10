public class code_45 {
    public static String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ') {
                answer += " ";
            }
            else if(Character.isUpperCase(ch)) {
                answer += ((char)((ch - 'A' + n) % 26 + 'A'));
            }
            else if(Character.isLowerCase(ch)){
                answer += ((char)((ch - 'a' + n) % 26 + 'a'));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        System.out.println(solution(s, n));
    }
}

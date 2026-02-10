public class code_43 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(new Solution().solution(t, p));
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i + p.length() <= t.length(); i++){
            int intT = Integer.valueOf(t.substring(i, i + p.length()));
            int intP = Integer.valueOf(p);
            if(intT <= intP)
                answer++;
        }
        return answer;
    }
}

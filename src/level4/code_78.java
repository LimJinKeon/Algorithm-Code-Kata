package level4;

public class code_78 {
    public static int solution(int n) {
        int prev1 = 0;
        int prev2 = 1;

        for(int i = 2; i <= n; i++) {
            int cur = (prev1 + prev2) % 1234567;
            prev1 = prev2;
            prev2 = cur;
        }

        return prev2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }
}

package level4;

public class code_82 {
    public static long solution(int n) {
        if (n <= 1) return 1;

        long prev2 = 1;
        long prev1 = 1;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = (prev1 + prev2) % 1234567;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }
}

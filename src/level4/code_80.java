package level4;

public class code_80 {
    public static int solution(int n, int a, int b) {
        int answer = 1;
        int big = Math.max(a, b);
        int small = Math.min(a, b);

        while(small % 2 == 0 || small + 1 != big) {
            big = next(big);
            small = next(small);
            answer++;
        }
        return answer;
    }

    private static int next(int x) {
        return (x % 2 == 0) ? x / 2 : ((x / 2) + (x % 2));
    }

    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;
        System.out.println(solution(N, A, B));
    }
}

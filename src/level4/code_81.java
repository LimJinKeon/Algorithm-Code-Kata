package level4;

public class code_81 {
    public static int solution(int[] arr) {
        if(arr.length == 1) return arr[0];

        int answer = lcm(arr[0], arr[1]);

        for(int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if(a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));
    }
}

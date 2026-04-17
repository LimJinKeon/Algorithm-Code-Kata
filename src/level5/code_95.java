package level5;

public class code_95 {

    public static int solution(int n, int k) {
        int answer = 0;
        String[] str = Integer.toString(n, k).replaceAll("0+", " ").split("\\s+");

        for (String s : str) {
            if (prime(Integer.parseInt(s))) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean prime(int n) {
        if (n == 1) {
            return Boolean.FALSE;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;
        System.out.println(solution(n, k));
    }
}

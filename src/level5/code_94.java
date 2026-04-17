package level5;

public class code_94 {

    private static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }

    private static void dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        dfs(numbers, depth + 1, sum + numbers[depth], target);
        dfs(numbers, depth + 1, sum - numbers[depth], target);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(solution(numbers, target));
    }
}

import java.util.Arrays;

public class code_48 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end   = commands[i][1];
            int k     = commands[i][2];

            int[] sub = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(sub);
            answer[i] = sub[k - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
}

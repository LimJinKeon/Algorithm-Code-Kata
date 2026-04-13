package level5;

public class code_93 {
    static int answer = 0;
    static boolean[] visited;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private static void dfs(int fatigue, int[][] dungeons, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0];
            int use = dungeons[i][1];

            if (!visited[i] && fatigue >= need) {
                visited[i] = true;
                dfs(fatigue - use, dungeons, count + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(solution(k, dungeons));
    }
}

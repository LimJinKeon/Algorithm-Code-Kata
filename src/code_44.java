public class code_44 {
    public static int solution(int[][] sizes) {
        int preMax = 0;
        int preMin = 0;
        for(int i = 0; i < sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            preMax = Math.max(max, preMax);
            preMin = Math.max(min, preMin);
        }
        return preMax * preMin;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
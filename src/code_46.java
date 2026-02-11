public class code_46 {
    public static int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < num.length; i++){
            s = s.replace(num[i], i + "");
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}

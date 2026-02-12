package level4;

public class code_67{
    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for(char ch : s.toCharArray()) {
            int idx = 0;

            while(idx != index) {
                ch++;

                if(ch > 'z')
                    ch = 'a';

                if(!skip.contains(String.valueOf(ch))) {
                    idx++;
                }
            }
            answer.append(ch);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s, skip, index));
    }
}

package level4;

import java.util.HashMap;

public class code_69 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> mbti = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};

        for (char ch : types) {
            mbti.put(ch, 0);
        }

        for(int i = 0; i < survey.length; i++){
            if(choices[i] < 4)
                mbti.put(survey[i].charAt(0), 4 - choices[i]);
            else if(choices[i] > 4)
                mbti.put(survey[i].charAt(1), choices[i] - 4);
        }

        for(int j = 0; j < 8; j = j + 2) {
            if(mbti.get(types[j]) >= mbti.get(types[j + 1]))
                answer += types[j];
            else
                answer += types[j + 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }
}

package level4;

import java.util.*;

public class code_84 {
    public static int solution(String s) {
        int answer = 0;

        for(int offset = 0; offset < s.length(); offset++) {  // 괄호 문자열을 왼쪽으로 한 칸씩 회전
            if(bracket(s, offset)) answer++;
        }

        return answer;
    }

    public static boolean bracket(String s, int offset) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt((offset + i) % size);

            switch(ch) {
                case '(', '{', '[' -> stack.push(ch);	// 왼쪽 괄호들이면 push

                case ')', '}', ']' -> {      // 오른쪽 괄호들이고
                    if (stack.empty()) {     // stack이 비었으면 거짓
                        return false;
                    }

                    char open = stack.pop();    // 괄호의 쌍이 맞지 않으면 거짓
                    if (!isMatched(open, ch)) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();				//stack이 비었으면 참
    }

    private static boolean isMatched(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }
}

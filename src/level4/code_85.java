package level4;

import java.util.HashSet;

public class code_85 {
    public static int solution(int[] elements) {
        int size = elements.length;
        int[] extended = new int[size * 2];

        for (int i = 0; i < size; i++) {
            extended[i] = elements[i];
            extended[i + size] = elements[i];
        }

        int[] prefixSum = new int[size * 2 + 1];
        for (int i = 0; i < size * 2; i++) {
            prefixSum[i + 1] = prefixSum[i] + extended[i];
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int len = 1; len <= size; len++) {
            for (int start = 0; start < size; start++) {
                int sum = prefixSum[start + len] - prefixSum[start];
                hashSet.add(sum);
            }
        }

        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution(elements));
    }
}

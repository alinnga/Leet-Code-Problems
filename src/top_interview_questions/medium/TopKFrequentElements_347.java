package top_interview_questions.medium;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements_347 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();

        for(int n:nums){
            if(map.containsKey(n)){
                Integer freq = map.get(n);
                freq++;
                map.put(n, freq);
            }
            else{
                map.put(n, 1);
            }
        }

        int[] topK = map.entrySet().stream()
                .sorted((m1, m2) ->
                        -m1.getValue().compareTo(m2.getValue()))
                .mapToInt(e -> e.getKey()).limit(k).toArray();
        System.out.println();
    }
}

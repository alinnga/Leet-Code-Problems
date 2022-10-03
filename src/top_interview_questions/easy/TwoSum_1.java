package top_interview_questions.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int len = nums.length;
        int[] res = new int[2];

        // Time O(n^2)
//        for(int i =0; i<len; i++){
//            int firstNum = nums[i];
//            for(int j = 0; j<len && j!=i; j++){
//                if(firstNum + nums[j] ==target){
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }

        // Time O(n) using HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< len; i++){
            map.put(nums[i], i);
        }
        for(int i =0; i < len; i++){
            if(map.get(target-nums[i])!=null && i!= map.get(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }
        }

        System.out.println(Arrays.toString(res));
    }
}

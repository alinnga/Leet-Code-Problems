package NeetCode150.arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive_128 {
    public static void main(String[] args) {
        int maxLen = longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        System.out.println();
    }
    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<len; i++){
            map.put(nums[i], i);
        }

        int maxLen = 0;
        int currLen;
        int findNumber;

        for(int i = 0; i < len; i++){
            currLen=1;
            findNumber = nums[i];
            while (true) {
                if (map.containsKey(++findNumber)) {
                    map.remove(findNumber);
                    currLen++;
                } else {
                    break;
                }
            }
            findNumber = nums[i];
            while (true) {
                if (map.containsKey(--findNumber)) {
                    map.remove(findNumber);
                    currLen++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}

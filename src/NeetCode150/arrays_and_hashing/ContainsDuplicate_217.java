package NeetCode150.arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println();
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                return true;
            }
            map.put(n, n);
        }
        return false;
    }
}

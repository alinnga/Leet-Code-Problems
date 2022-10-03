package plan.prefixSum;

import java.util.Arrays;

public class RunningSumOf1Array_1480 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 10, 4};
        int length = nums.length;
        int[] prefixSum = new int[length];
        prefixSum[0] = nums[0];
        for(int i=1; i<length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}

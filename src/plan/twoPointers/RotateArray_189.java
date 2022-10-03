package plan.twoPointers;

import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        int length = nums.length;
        k = k%length;
        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp =  nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}

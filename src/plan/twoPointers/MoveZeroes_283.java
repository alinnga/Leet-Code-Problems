package plan.twoPointers;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 0, 0, 3, 4, 0, 5};
        int length = nums.length;
        int firstPointer = 0;
        int secondPointer = 1;
        while(secondPointer<length){
            if (nums[firstPointer] != 0 && nums[secondPointer] != 0) {
                firstPointer++;
                secondPointer++;
            }
            else if(nums[firstPointer] != 0 && nums[secondPointer] == 0){
                firstPointer++;
                secondPointer++;
            }
            else if(nums[firstPointer] == 0 && nums[secondPointer] != 0){
                int temp = nums[firstPointer];
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer] = temp;
            }
            else if(nums[firstPointer] == 0 && nums[secondPointer] == 0){
                secondPointer++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

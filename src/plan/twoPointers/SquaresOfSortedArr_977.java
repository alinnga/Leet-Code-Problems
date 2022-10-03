package plan.twoPointers;

import java.util.Arrays;

public class SquaresOfSortedArr_977 {
    public static void main(String[] args) {
       int[] nums = new int[]{-7, -3, 2, 3, 11};
       int length = nums.length;
       int[] result = new int[length];

       int firstPointer = 0;
       int secondPointer = length-1;
       int index = length-1;
       while(index>=0){
           int square1 = nums[firstPointer]*nums[firstPointer];
           int square2 = nums[secondPointer]*nums[secondPointer];

           if(square1 > square2){
               result[index] = square1;
               firstPointer++;
           }
           else{
               result[index] = square2;
               secondPointer--;
           }
           index--;
       }
        System.out.println(Arrays.toString(result));
    }
}

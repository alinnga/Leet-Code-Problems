package plan.twoPointers;

import java.util.Arrays;

public class TwoSum_167 {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1, 0};
        int target = -1;
        int[] result = new int[2];
        int length = numbers.length;
        int indexStart = 0;
        int indexEnd = length-1;
        int firstPointer = 0;
        int secondPointer = length-1;
        while(numbers[firstPointer]+numbers[secondPointer]!=target){
            if(numbers[firstPointer]+numbers[secondPointer]>target){
                secondPointer--;
            }
            if(numbers[firstPointer]+numbers[secondPointer]<target){
                firstPointer++;
            }
        }
        result[0] = firstPointer+1;
        result[1] = secondPointer+1;
        System.out.println(Arrays.toString(result));
    }
}

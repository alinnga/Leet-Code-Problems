package NeetCode150.two_pointers;

import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-10, -8, -6, 1, 2, 4, 4, 5, 6, 7, 30});
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        Map<String, List<Integer>> list = new HashMap<>();
        for(int i = 0; i < len; i++){
            int firstNumber = nums[i];
            int firstPointer = 0;
            int lastPointer = len-1;
            while(firstPointer < lastPointer){
                if(firstPointer!=i && lastPointer!=i){
                    if(nums[firstPointer] + nums[lastPointer] > -firstNumber){
                        lastPointer--;
                    }
                    else if(nums[firstPointer] + nums[lastPointer] < -firstNumber){
                        firstPointer++;
                    }
                    else{
                        List<Integer> trinity = new ArrayList<>();
                        int[] arr = new int[]{nums[lastPointer], nums[firstPointer], firstNumber};
                        Arrays.sort(arr);
                        trinity.add(arr[0]);
                        trinity.add(arr[1]);
                        trinity.add(arr[2]);
                        list.put(arr[0]+","+arr[1]+","+arr[2], trinity);
                        firstPointer++;
                        lastPointer--;
                    }
                }
                else if(firstPointer==i){
                    firstPointer++;
                }
                else if(lastPointer==i){
                    lastPointer--;
                }
            }
        }
        return list.values().stream().toList();
    }
}

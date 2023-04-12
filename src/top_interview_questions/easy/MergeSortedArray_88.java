package top_interview_questions.easy;

import java.util.ArrayList;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 10, 12, 15, 0, 0, 0},8, new int[]{2, 5, 6}, 3);
        System.out.println();

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0;
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(tempList.isEmpty()){
                if(nums1[i] > nums2[pointer1]){
                    tempList.add(nums1[i]);
                    nums1[i] = nums2[pointer1];
                    pointer1++;
                }
            }
            else{
                if(nums1[i] > nums2[pointer1] && tempList.get(0) > nums2[pointer1]){
                    tempList.add(nums1[i]);
                    nums1[i] = nums2[pointer1];
                    pointer1++;
                }
                else if(nums1[i] > nums2[pointer1] && tempList.get(0) < nums2[pointer1]){
                    nums1[i] = tempList.get(0);
                    tempList.remove(0);
                }
            }
        }
    }
}

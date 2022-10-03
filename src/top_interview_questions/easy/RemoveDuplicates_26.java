package top_interview_questions.easy;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int len = nums.length;
        int[] prev = new int[]{nums[0], 0};
        int pointer = 1;
        int cnt = 1;
        while(pointer < len){
            if(nums[pointer] == prev[0]){
                swap(nums, prev[1]+1, pointer);
            }
            else{
                cnt++;
                swap(nums, prev[1]+1, pointer);
                prev[0] = nums[prev[1]+1];
                prev[1] = prev[1]+1;
            }
            pointer++;
        }
        System.out.println(cnt);
    }

    private static void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}

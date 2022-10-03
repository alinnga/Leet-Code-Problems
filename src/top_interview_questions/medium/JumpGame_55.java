package top_interview_questions.medium;

public class JumpGame_55 {
    public static void main(String[] args) {
        boolean b = canJump(new int[]{2, 5, 0, 0});
        System.out.println();
    }

    public static boolean canJump(int[] nums) {
        int goal = nums.length-1;

        for(int i = nums.length-2; i >= 0; i--){
            if(i+nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}

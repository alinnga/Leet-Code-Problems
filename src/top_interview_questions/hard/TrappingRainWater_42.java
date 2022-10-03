package top_interview_questions.hard;

public class TrappingRainWater_42 {
    public static void main(String[] args) {
        int[] height =  new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int len = height.length;
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1 < len || pointer2 < len){
            if(height[pointer1] == 0){
                pointer1++;
            }
            else if(height[pointer2] == 0 || (pointer2-pointer1) < 2){
                pointer2++;
            }
            else{
                // TODO: 03.10.2022 complete trapping rain water problem
            }
        }
    }
}

package top_interview_questions.medium;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] colors = new int[]{0, 1, 2, 2, 2, 1, 1};
        sortColors(colors);
        System.out.println();
    }

    public static void sortColors(int[] nums) {
         int redCount = 0;
         int whiteCount = 0;
         int blueCount = 0;

         for(int col:nums){
             if(col==0) redCount++;
             if(col==1) whiteCount++;
             if(col==2) blueCount++;
         }

         for(int i = 0; i< redCount; i++){
             nums[i] = 0;
         }
        for(int i = redCount; i< redCount+whiteCount; i++){
            nums[i] = 1;
        }
        for(int i = redCount+whiteCount; i< redCount+whiteCount+blueCount; i++){
            nums[i] = 2;
        }
    }
}

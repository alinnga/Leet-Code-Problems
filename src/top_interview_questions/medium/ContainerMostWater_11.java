package top_interview_questions.medium;

public class ContainerMostWater_11 {
    public static void main(String[] args) {
        int[] height = new int[]{2, 4, 4, 9, 7, 6, 9, 4, 1};
        int len = height.length;
        int pointer1 = 0;
        int pointer2 = len-1;
        int max = 0;
        while(pointer1<pointer2){
            int area = (pointer2-pointer1)*Math.min(height[pointer1], height[pointer2]);
            max = Math.max(area, max);
            if(height[pointer1]<height[pointer2]){
                pointer1++;
            }
            else{
                pointer2--;
            }
        }
        System.out.println(max);
    }
}

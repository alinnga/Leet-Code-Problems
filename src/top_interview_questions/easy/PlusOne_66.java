package top_interview_questions.easy;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};
        int len = digits.length;
        int pointer = len-2;

        if(digits[len-1]!=9) digits[len-1]++;
        else{
            digits[len-1] = 0;
            while(pointer>=0){
                if(digits[pointer]==9){
                    digits[pointer] = 0;
                    pointer--;
                }
                else{
                    digits[pointer]++;
                    break;
                }
            }
            if(pointer<0 && digits[0]==0){
                int[] newDigits = new int[len+1];
                newDigits[0] = 1;
            }
        }
    }
}

package top_interview_questions.easy;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 5, 5, 3, 3, 7};

        // XOR operator ^:
        // 0 ^ number = number;
        // number ^ number = 0;
        // then N1^N1^N2^N2^N3^N3^N4  = N4

        int res = 0;
        for(int n : nums){
            res = res^n;
        }

        System.out.println(res);
    }
}

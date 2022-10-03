package top_interview_questions.easy;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n];
        int total = climbStairs(n, memo);
    }
    public static int climbStairs(int n, int[] memo) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(memo[n-1] != 0){
            return memo[n-1];
        }
        memo[n-1] = climbStairs(n-1, memo) + climbStairs(n-2, memo);
        return memo[n-1];
    }
}

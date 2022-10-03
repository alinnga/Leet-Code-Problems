package plan.prefixSum;

public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, -1, 0, 0, -1, -1};
        int length = nums.length;
        int leftSum =0;
        int rightSum =0;
        int[] prefixSum = new int[length];
        prefixSum[0]= nums[0];
        int result = -1;
        for(int i=1; i < length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        for(int i =0; i< length; i++){
            if(i!=0){
                leftSum = prefixSum[i-1];
            }
            rightSum = prefixSum[length-1]-prefixSum[i];
            if(leftSum==rightSum){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}

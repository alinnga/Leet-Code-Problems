package NeetCode150.arrays_and_hashing;

public class ProductExceptSelf_238 {
    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{-1,1,0,-3,3});
        System.out.println();
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefixSum =  new int[len];
        int[] reversePrefixSum = new int[len];
        int[] res = new int[len];
        prefixSum[0] = 1;
        reversePrefixSum[len-1] = 1;
        for(int i = 1; i < len; i++){
            prefixSum[i] = prefixSum[i-1]*nums[i-1];
        }

        for(int i = len-2; i >= 0; i--){
            reversePrefixSum[i] = reversePrefixSum[i+1]*nums[i+1];
        }

        for(int i = 0; i < len; i++){
            res[i] = prefixSum[i]*reversePrefixSum[i];
        }
        return res;
    }
}

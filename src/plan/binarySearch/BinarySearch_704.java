package plan.binarySearch;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0 , 3, 5, 9, 12};
        int target = -5;
        int length = nums.length;
        int first = 0;
        int last = length-1;
        int mid;
        int result = -1;
        while(first <= last){
            mid = (last+first)/2;
            if(target < nums[mid] ){
                last = mid-1;
            }
            else if(target > nums[mid]){
                first = mid+1;
            }
            else{
                result = mid;
                break;
            }
        }
        System.out.println(result);
    }
}

package plan.binarySearch;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target =4;
        int first = 0;
        int last = nums.length-1;
        int mid = 0;
        int result = -1;
        while(first<=last){
            mid = first + (last-first)/2;
            if(target > nums[mid]){
                first = mid+1;
            }
            else if(target < nums[mid]){
                last = mid-1;
            }
            else{
                result = mid;
                break;
            }
        }
        result = result==-1? first: result;
        System.out.println(result);
    }
}

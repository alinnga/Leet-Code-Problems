package plan.binarySearch;

public class FirstBadVersion_278 {
    public static void main(String[] args) {
        int n = 1;
        int first = 1;
        int last = n;
        int mid;
        int result=0;
        while(first<=last){
            mid = (first+last)/2;
            if(isBadVersion(mid) && isBadVersion(mid-1)){
                last = mid-1;
            }
            else if(!isBadVersion(mid) && !isBadVersion(mid+1)){
                first = mid + 1;
            }
            else if(isBadVersion(mid) && !isBadVersion(mid-1)){
                result = mid;
                break;
            }
            else if(!isBadVersion(mid) && isBadVersion(mid+1)){
                result = mid+1;
                break;
            }
        }
        System.out.println(result);
    }
    static boolean isBadVersion(int version){
        return version==1;
    }
}

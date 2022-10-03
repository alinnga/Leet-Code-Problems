package plan.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        String s = "bbbabc";
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int deleteIndex = 0;
        int maxLength = 0;
        int i = 0;
        while(i<length){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(deleteIndex));
                deleteIndex++;
            }
            else{
                set.add(s.charAt(i));
                i++;
                maxLength = Math.max(maxLength, set.size());
            }
        }
        System.out.println(maxLength);
    }
}

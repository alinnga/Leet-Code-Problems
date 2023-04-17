package NeetCode150.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestCharacterReplacement_424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int result = 0;
        int start = 0;
        char[] arrayStr = s.toCharArray();
        int windowLen;
        HashMap<Character, Integer> occurrencesCount = new HashMap<>();
        for(int end = 0; end < arrayStr.length; end++){
            windowLen = end - start + 1;
            occurrencesCount.put(arrayStr[end], occurrencesCount.getOrDefault(arrayStr[end], 0)+1);
            int maxOccurrence = 0;
            for(Map.Entry<Character, Integer> entry : occurrencesCount.entrySet()){
                if(entry.getValue() > maxOccurrence) maxOccurrence = entry.getValue();
            }

            if(windowLen - maxOccurrence <= k && windowLen > result) result = windowLen;

            if(windowLen - maxOccurrence > k){
                occurrencesCount.put(arrayStr[start], occurrencesCount.get(arrayStr[start])-1);
                start++;
            }

        }
        return result;
    }
}

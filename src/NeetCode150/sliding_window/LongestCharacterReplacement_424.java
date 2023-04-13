package NeetCode150.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestCharacterReplacement_424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int result = 0;
        int startWindow = 0;
        int endWindow = 0;
        char[] arrayStr = s.toCharArray();
        int windowLen = 1;
        while(endWindow < arrayStr.length){
            int internalPointer = startWindow;
            HashMap<Character, Integer> occurrencesCount = new HashMap<>();
            while(internalPointer <= endWindow){
                char currentChar = arrayStr[internalPointer];
                occurrencesCount.computeIfPresent(currentChar, (key, val)-> val+1);
                occurrencesCount.putIfAbsent(currentChar, 1);
                internalPointer++;
            }
            int maxOccurrence = 0;
            for(Map.Entry<Character, Integer> entry : occurrencesCount.entrySet()){
                if(entry.getValue() > maxOccurrence) maxOccurrence = entry.getValue();
            }
            if(windowLen - maxOccurrence <= k && windowLen > result) result = windowLen;

            endWindow++;
            if(windowLen - maxOccurrence > k){
                startWindow++;
            }
            windowLen = endWindow - startWindow + 1;
        }
        return result;
    }
}

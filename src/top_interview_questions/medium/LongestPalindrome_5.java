package top_interview_questions.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_5 {
    public static void main(String[] args) {
        String longest = longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        System.out.println();
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        int iLong = 0;
        int jLong = 0;
        Map<String, Boolean> isPalindromes = new HashMap<>();
        for(int i = 0; i<len; i++){
            for(int j = i; j < len; j++){
                if(isPalindrome(s, i, j, isPalindromes)){
                    if(j-i > jLong-iLong){
                        jLong = j;
                        iLong = i;
                    }
                }
            }
        }
        return s.substring(iLong, jLong+1);
    }
    public static boolean isPalindrome(String s, int i, int j, Map<String, Boolean> isPalindromes) {
        String key = i+"/"+j+"";
        if(i==j){
            isPalindromes.put(key, true);
            return true;
        }
        if(j==i+1){
            isPalindromes.put(key, s.charAt(i) == s.charAt(j));
            return isPalindromes.get(key);
        }
        if(isPalindromes.containsKey(key)){
            return isPalindromes.get(key);
        }

        isPalindromes.put(key,  isPalindrome(s, i+1, j-1, isPalindromes) && s.charAt(i) == s.charAt(j));
        return isPalindromes.get(key);
    }
}

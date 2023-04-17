package NeetCode150.sliding_window;


public class PermutationInString_567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));

    }
    public static boolean checkInclusion(String s1, String s2) {
        int winLen = s1.length();
        int start = 0;
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
        }

        for(int end=start+winLen-1; end<s2.length(); end++, start++){
            if(isPermutation(s1map, s2.substring(start, end+1))){
                return true;
            }
        }
        return false;
    }
    public static boolean isPermutation(int[] s1map,  String s2){
        int[] s2map = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            s2map[s2.charAt(i) - 'a']++;
        }

        for(int i =0; i< 26; i++){
            if(s1map[i]!=s2map[i]){
                return false;
            }
        }
        return true;
    }
}

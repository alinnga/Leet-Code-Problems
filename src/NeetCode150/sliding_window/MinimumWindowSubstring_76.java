package NeetCode150.sliding_window;

public class MinimumWindowSubstring_76 {
    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int[] tMap = new int[58];
        for(int i=0; i<t.length(); i++){
            tMap[t.charAt(i)-'A']++;
        }

        int winLen = t.length();
        int start = 0;
        int end = winLen-1;
        int minWinLen = s.length();
        int[] minWinPoints = new int[]{-1, -1};
        while(start <= end && end < s.length()){
            if(isContained(s.substring(start, end+1), tMap)){
                if(minWinLen >= end-start+1){
                    minWinLen = end-start+1;
                    minWinPoints[0] = start;
                    minWinPoints[1] = end;
                }
                start++;
            }
            else{
                end++;
            }
        }
        if(minWinPoints[0]==-1){
            return "";
        }
        return s.substring(minWinPoints[0], minWinPoints[1]+1);
    }

    public static boolean isContained(String subS, int[] tMap){
        int[] subSMap = new int[58];
        for(int i=0; i<subS.length(); i++){
            subSMap[subS.charAt(i)-'A']++;
        }

        boolean isValid = true;
        for(int i = 0; i<58; i++){
            if(tMap[i]!=0 && tMap[i]>subSMap[i]){
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}

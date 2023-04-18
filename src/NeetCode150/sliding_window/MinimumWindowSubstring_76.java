package NeetCode150.sliding_window;

public class MinimumWindowSubstring_76 {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int[] tMap = new int[58];
        for (int i = 0; i < t.length(); i++) {
            tMap[t.charAt(i) - 'A']++;
        }

        int start = 0;
        int end = 0;
        int[] subSMap = new int[58];
        subSMap[s.charAt(end) - 'A']++;
        int minWinLen = s.length();
        int[] minWinPoints = new int[]{-1, -1};
        while (start <= end && end < s.length()) {
            if (isContained(subSMap, tMap)) {
                if (minWinLen >= end - start + 1) {
                    minWinLen = end - start + 1;
                    minWinPoints[0] = start;
                    minWinPoints[1] = end;
                }
                subSMap[s.charAt(start) - 'A']--;
                start++;
            } else {
                end++;
                if (end < s.length()) {
                    subSMap[s.charAt(end) - 'A']++;
                }
            }
        }
        if (minWinPoints[0] == -1) {
            return "";
        }
        return s.substring(minWinPoints[0], minWinPoints[1] + 1);
    }

    public static boolean isContained(int[] subSMap, int[] tMap) {
        boolean isValid = true;
        for (int i = 0; i < 58; i++) {
            if (tMap[i] != 0 && tMap[i] > subSMap[i]) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}

package NeetCode150.two_pointers;

import java.io.File;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        boolean isPal = isPalindrome("ab_a");
        File fileOnWin = new File(".\\images\\file.txt");
        boolean exists = fileOnWin.exists();
        System.out.println();
    }
    public static boolean isPalindrome(String s) {
        String newS = s.toLowerCase().replaceAll("[\\W_]", "");
        int len = newS.length();
        int pointer1 = 0;
        int pointer2 = len-1;
        while(pointer1<pointer2){
            if(newS.charAt(pointer1)!=newS.charAt(pointer2)){
                return false;
            }
            pointer2--;
            pointer1++;
        }
        return true;
    }
}

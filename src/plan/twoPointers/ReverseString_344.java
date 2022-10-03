package plan.twoPointers;

import java.util.Arrays;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        int length = s.length;
        int firstPointer = 0;
        int secondPointer = length-1;
        while(firstPointer<secondPointer){
            char temp = s[firstPointer];
            s[firstPointer] = s[secondPointer];
            s[secondPointer] = temp;
            firstPointer++;
            secondPointer--;
        }
        System.out.println(Arrays.toString(s));
    }
}

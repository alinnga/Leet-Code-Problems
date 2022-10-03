package top_interview_questions.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String s = "LVIII";
        int len = s.length();
        Map<Character, Integer> map = Map.of(
                                    'I',1,
                                    'V', 5,
                                    'X', 10,
                                    'L', 50,
                                    'C', 100,
                                    'D', 500,
                                    'M', 1000);
        int[] intArr = new int[len];
        intArr[len-1] = map.get(s.charAt(len-1));
        int res  = intArr[len-1];
        for(int i = len-2; i>=0; i--){
            intArr[i] = map.get(s.charAt(i));
            int prev = intArr[i+1];
            int cur = intArr[i];

            if(cur < prev) res-=cur;
            else res+=cur;
        }
        System.out.println(res);


    }
}

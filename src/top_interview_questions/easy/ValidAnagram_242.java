package top_interview_questions.easy;

import java.util.*;

public class ValidAnagram_242 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean isAnagram = true;
        List<Character> sList = new ArrayList<>();
        for(char c: s.toCharArray()){
            sList.add(c);
        }
        for(char c: t.toCharArray()){
            if(sList.contains(c)) sList.remove((Object) c);
            else {
                isAnagram = false;
                break;
            }
        }
        if(!sList.isEmpty()) isAnagram = false;
        System.out.println(isAnagram);

    }
}

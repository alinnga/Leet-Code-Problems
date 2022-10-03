package top_interview_questions.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;

public class ValidParentheses_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = Map.of('}', '{', ')', '(', ']', '[');
        boolean valid = true;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c =='{' || c == '[' || c == '('){
                stack.push(c);
            }
            else{
                if(stack.peek() == map.get(c)) stack.pop();
                else {
                    valid = false;
                    break;
                }
            }
        }
        if(stack.peek()!=null) valid = false;
        System.out.println(valid);
    }
}

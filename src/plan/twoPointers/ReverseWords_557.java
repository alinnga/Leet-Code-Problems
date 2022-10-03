package plan.twoPointers;

public class ReverseWords_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String resultString = "";
        String[] words = s.split("\s");
        int len = words.length;
        for(int i = 0; i < len; i++){
            char[] chars = words[i].toCharArray();
            reverseCharArray(chars);
            String newWord = new String(chars);
            resultString =  resultString+newWord+" ";
        }
        System.out.println(resultString.trim());
    }


    public static void reverseCharArray(char[] s){
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
    }
}

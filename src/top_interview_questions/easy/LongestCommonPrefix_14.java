package top_interview_questions.easy;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "a"};
        Arrays.sort(strs);
        String prefix = "";
        int letterIndex = 0;
        boolean letterExists = true;
        boolean sameLetter = true;

        while(letterExists){

            if(strs[0].length()<=letterIndex){
                letterExists = false;
                break;
            }
            char letterToCompare = strs[0].charAt(letterIndex);
            for(int i = 1; i<strs.length; i++){
                if(strs[i].length()<=letterIndex){
                    letterExists = false;
                    sameLetter = false;
                    break;
                }
                if(strs[i].charAt(letterIndex) != letterToCompare){
                    sameLetter = false;
                    break;
                }
            }
            if(sameLetter){
                prefix = prefix + letterToCompare;
            }
            letterIndex++;
        }
        System.out.println(prefix);

    }
}

package top_interview_questions.medium;

import java.util.*;

public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        int len = strs.length;

        Map<String, List<String>> groups =  new HashMap<>();

        for(int i = 0; i< len; i++){

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            if(groups.containsKey(String.valueOf(chars))){
                groups.get(String.valueOf(chars)).add(strs[i]);
            }
            else{
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                groups.put(String.valueOf(chars), newGroup);
            }
        }

        new ArrayList<>(groups.values());
        System.out.println();
    }
}

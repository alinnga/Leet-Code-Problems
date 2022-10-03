package top_interview_questions.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_179 {
    public static void main(String[] args) {
        String s = largestNumber(new int[]{0, 0, 0});
        System.out.println();
    }

    public static String largestNumber(int[] nums) {
        Comparator<String> comparator = (o1, o2) -> (o2 + o1).compareTo(o1 + o2);
        String[] numsStr = Arrays.stream(nums)
                .mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numsStr, comparator);
        if(numsStr[0].equals("0")) return "0";
        String result = Arrays.stream(numsStr)
                .reduce("", (subtotal, element) -> subtotal + element);
        return result;
    }

}

package tasks;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello world   ";
        String[] arr = s.split("\s");
        String lastWord = arr[arr.length-1];
        System.out.println(lastWord.length());
    }
}

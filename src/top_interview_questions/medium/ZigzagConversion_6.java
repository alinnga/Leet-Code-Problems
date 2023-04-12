package top_interview_questions.medium;

public class ZigzagConversion_6 {
    public static void main(String[] args) {
        String s = "123456789";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        char[] array = s.toCharArray();
        int len = array.length;
        int step = (numRows-1)*2;
        StringBuilder newStr = new StringBuilder();
        for(int row = 0; row < numRows; row++){
            int index = row;
            newStr.append(array[index]);

            int step1 = step-row*2;
            int step2 = row*2;
            int index1;
            int index2;
            if(step1!=0 && step2 !=0){
                index1 = index+step1;
                index2 = index1+step2;

                while(true) {
                    if(index1 >= len){
                        break;
                    }
                    newStr.append(array[index1]);

                    if(index2 >= len){
                        break;
                    }
                    newStr.append(array[index2]);
                    index1 = index2+step1;
                    index2 = index1+step2;
                }
            }
            else{
                index = index+step;
                while(index < len) {
                    newStr.append(array[index]);
                    index = index+step;
                }
            }
        }
        return newStr.toString();
    }
}

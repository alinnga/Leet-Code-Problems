package top_interview_questions.medium;

public class RotateImage_48 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int len = matrix.length;
        for(int i = 0; i< len; i++){
            for(int j = i; j < len; j++){
                swap(matrix, new int[]{i, j}, new int[]{j, i});
            }
        }
        int pointer1 = 0;
        int pointer2 = len-1;
        while(pointer1 < pointer2){
            for(int i =0; i < len; i++){
                swap(matrix, new int[]{i, pointer1}, new int[]{i, pointer2});
            }
            pointer1++;
            pointer2--;
        }
    }

    private static void swap(int[][] matrix, int[] index1, int[] index2){
        int temp = matrix[index1[0]][index1[1]];
        matrix[index1[0]][index1[1]] = matrix[index2[0]][index2[1]];
        matrix[index2[0]][index2[1]] = temp;
    }
}

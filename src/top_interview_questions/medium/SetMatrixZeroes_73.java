package top_interview_questions.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1}};

        int n = matrix.length;
        int m = matrix[0].length;

        Set<Integer> zeroesColumn = new HashSet<>();
        Set<Integer> zeroesRow = new HashSet<>();
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(matrix[i][j] == 0){
                    zeroesColumn.add(j);
                    zeroesRow.add(i);
                }
            }
        }
        for(int j : zeroesColumn){
            for(int i = 0; i< n; i++){
                matrix[i][j] = 0;
            }
        }

        for(int i : zeroesRow){
            for(int j = 0; j< m; j++){
                matrix[i][j] = 0;
            }
        }
        System.out.println();


    }
}

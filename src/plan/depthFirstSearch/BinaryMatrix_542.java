package plan.depthFirstSearch;

public class BinaryMatrix_542 {
    static int[][] distanceMatrix;
    public static void main(String[] args) {
        int[][] mat =  new int[][]{{0,0,0}, {0,1,0},{1,1,1}};
        int n = mat.length;
        int m = mat[0].length;
        int minDistance = 0;
        distanceMatrix =  new int[n][m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                distanceMatrix[i][j] = -1;
            }
        }
        countDistance(mat, 2, 1, 2, 1, 0);
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
            }
        }
    }
    private static void countDistance(int[][] mat, int iInit, int jInit, int i, int j, int curDistance){
        if(i>=mat.length || j >= mat[0].length || i<0 || j<0) return;
        if(mat[i][j]==0){
            if((distanceMatrix[iInit][jInit]!=-1 && distanceMatrix[iInit][jInit]> curDistance) || distanceMatrix[iInit][jInit]==-1){
                distanceMatrix[iInit][jInit] = curDistance;
            }
            return;
        }
        curDistance++;
        countDistance(mat, iInit, jInit, i+1, j, curDistance);
        countDistance(mat, iInit, jInit, i-1, j, curDistance);
        countDistance(mat, iInit, jInit, i, j+1, curDistance);
        countDistance(mat, iInit, jInit, i, j-1, curDistance);
    }
}

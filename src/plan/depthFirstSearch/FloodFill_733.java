package plan.depthFirstSearch;

import java.util.Arrays;

public class FloodFill_733 {
    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        fillImage(image, sr, sc, image[sr][sc], color);
        System.out.println(Arrays.deepToString(image));

    }
    static void fillImage(int[][] image, int sr, int sc, int initialColor,  int targetColor){
        int n = image.length;
        int m = image[0].length;
        if(sr <0 || sr> n-1 || sc< 0|| sc > m-1 || image[sr][sc]!=initialColor || image[sr][sc] == targetColor) return;
        image[sr][sc] = targetColor;
        fillImage(image, sr+1, sc, initialColor, targetColor);
        fillImage(image, sr-1, sc, initialColor, targetColor);
        fillImage(image, sr, sc+1, initialColor, targetColor);
        fillImage(image, sr, sc-1, initialColor, targetColor);
    }
}

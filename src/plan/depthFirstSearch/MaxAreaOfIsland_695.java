package plan.depthFirstSearch;

public class MaxAreaOfIsland_695 {
    static int area = 0;
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int maxArea = 0;
        for(int i =0; i< grid.length; i++){
            for(int j =0; j< grid[0].length; j++){
                if(grid[i][j]==1){
                    countArea(grid, i, j);
                    maxArea = Math.max(area, maxArea);
                    area = 0;
                }
            }
        }
        System.out.println(maxArea);
    }
    static void countArea(int[][] grid, int i, int j){
        if(i >= grid.length || i< 0 || j>= grid[0].length || j <0 || grid[i][j]==0) return;
        grid[i][j] = 0;
        area++;
        countArea(grid, i+1, j);
        countArea(grid, i-1, j);
        countArea(grid, i, j+1);
        countArea(grid, i, j-1);
    }
}

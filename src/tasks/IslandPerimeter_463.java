package tasks;

public class IslandPerimeter_463 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1}};
        int perimeter = 0;
        int rowCount = grid.length;
        for(int i=0; i < rowCount; i++){
            for(int j=0; j < grid[i].length; j++){
                if(grid[i][j]==1){
                    if(((j-1) >= 0 && grid[i][j-1]==0) || ((j-1) < 0)){
                        perimeter++;
                    }
                    if( ((j+1) < grid[i].length && grid[i][j+1]==0) || ((j+1) >= grid[i].length)){
                        perimeter++;
                    }
                    if(((i+1) < rowCount && grid[i+1][j]==0) || (i+1) >= rowCount){
                        perimeter++;
                    }
                    if(((i-1) >= 0 && grid[i-1][j]==0) || (i-1) < 0){
                        perimeter++;
                    }
                }
            }
        }
        System.out.println(perimeter);
    }
}
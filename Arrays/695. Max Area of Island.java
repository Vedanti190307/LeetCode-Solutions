class Solution {
    private int area(int[][] grid ,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return 1+area(grid,i+1,j)
                +area(grid,i-1,j)
                +area(grid,i,j+1)
                +area(grid,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int n=grid.length;
        int m=grid[0].length;
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    maxarea=Math.max(maxarea,area(grid,i,j));
                }
            }
        }
        return maxarea;
    }
}
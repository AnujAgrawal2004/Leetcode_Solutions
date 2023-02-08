class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length ==0 || grid[0].length==0){
            return 0;
        }
        int m=grid.length;
        int numOfIslands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    public void dfs(char grid[][],int row,int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[row].length ||  grid[row][col]!= '1'){
            return ;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }
}
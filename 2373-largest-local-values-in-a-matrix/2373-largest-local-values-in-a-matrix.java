class Solution {
    public int[][] largestLocal(int[][] grid) {
        int res[][] = new int [grid.length-2][grid.length-2];
        for (int i = 0 ; i < grid.length -2 ; i++) {
            for (int j = 0 ; j < grid.length - 2; j ++) {
                int max = Integer.MIN_VALUE;
                for (int r = i ; r < i+3 ; r++) {
                    for (int c = j ; c < j+3 ; c++) {
                        max = Math.max(max, grid[r][c]);
                    }
                }
                res[i][j] = max;
            }
                
        }

        return res;
    }
}
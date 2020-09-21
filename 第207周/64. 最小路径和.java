class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0)
            return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==0&&j==0)
                    continue;
                int left=(j==0?Integer.MAX_VALUE:grid[i][j-1]);
                int top=(i==0?Integer.MAX_VALUE:grid[i-1][j]);
                grid[i][j]+=(Math.min(left,top));
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}

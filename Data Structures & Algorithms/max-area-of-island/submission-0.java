class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    int count = islandArea(grid,visited,i,j);
                    if(count>max){
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    public static int islandArea(int[][] grid,int[][] visited,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==1 || grid[i][j]==0){
            return 0;
        }
        visited[i][j] =1;
        int area = 1;
        area += islandArea(grid,visited,i+1,j);
        area += islandArea(grid,visited,i-1,j);
        area += islandArea(grid,visited,i,j-1);
        area += islandArea(grid,visited,i,j+1);
        return area;
    }
}

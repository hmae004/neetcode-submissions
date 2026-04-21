class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int paths = 0;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    paths++;
                    findConnected(i,j,visited,grid);
                }
            }
        }
        return paths;
        
    }

    public void findConnected(int i,int j,int[][] visited,char[][] grid){
        visited[i][j] = 1;
        if(i-1>=0 && visited[i-1][j]==0 && grid[i-1][j]=='1'){
            findConnected(i-1,j,visited,grid);            
        }
        if(i+1<grid.length && visited[i+1][j]==0 && grid[i+1][j]=='1'){
            findConnected(i+1,j,visited,grid);
        }
        if(j-1>=0 && visited[i][j-1]==0 && grid[i][j-1]=='1'){
            findConnected(i,j-1,visited,grid);
        }
        if(j+1<grid[0].length && visited[i][j+1]==0 && grid[i][j+1]=='1'){
            findConnected(i,j+1,visited,grid);
        }
    }
}

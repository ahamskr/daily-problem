// Number Of Enclaves

class Solution {
    int numberOfEnclaves(int[][] grid) {
        // BFS solution
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&(i==0||j==0||i==n-1||j==m-1)) q.offer(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int i=arr[0],j=arr[1];
            grid[i][j]=0;
            if(i>0&&grid[i-1][j]==1) q.offer(new int[]{i-1,j});
            if(j>0&&grid[i][j-1]==1) q.offer(new int[]{i,j-1});
            if(i<n-1&&grid[i+1][j]==1) q.offer(new int[]{i+1,j});
            if(j<m-1&&grid[i][j+1]==1) q.offer(new int[]{i,j+1});
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) ans++;
            }
        }
        return ans;
    }
}
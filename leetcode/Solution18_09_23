class Solution18_09_23 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length,m=mat[0].length;
        int[][] ans=new int[n][2];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1) cnt++;
            }
            ans[i][0]=cnt;
            ans[i][1]=i;
        }
        Arrays.sort(ans,(a,b)->a[0]-b[0]);
        int[] returnAns=new int[k];
        for(int i=0;i<k;i++) returnAns[i]=ans[i][1];
        return returnAns;
    }
}
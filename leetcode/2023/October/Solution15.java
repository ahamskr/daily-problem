// 1269. Number of Ways to Stay in the Same Place After Some Steps

class Solution15 {
    int mod=1_000_000_007;
    public int numWays(int steps, int arrLen) {
        arrLen=Math.min(arrLen,steps);
        Long[][] dp=new Long[arrLen+1][steps+1];
        return (int)fun(0,arrLen,steps,dp)%mod;
    }
    long fun(int curIdx,int n,int stepsLeft,Long[][] dp){
        if(curIdx<0||curIdx>=n) return 0;
        if(stepsLeft==0){
            if(curIdx==0) return 1;
            return 0;
        }
        if(dp[curIdx][stepsLeft]!=null) return dp[curIdx][stepsLeft]%mod;
        long left=fun(curIdx-1,n,stepsLeft-1,dp);
        long right=fun(curIdx+1,n,stepsLeft-1,dp);
        long stay=fun(curIdx,n,stepsLeft-1,dp);
        return dp[curIdx][stepsLeft]=(left+right+stay)%mod;
    }
}

/*
class Solution {
    public int numWays(int steps, int arrLen) {
        int m = steps;
        int n = Math.min(steps / 2 + 1, arrLen);
        
        int[][] dp = new int[m + 1][n];
        dp[0][0] = 1;
        
        int mod = 1000000007;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
                if (j < n - 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                }
            }
        }
        
        return dp[m][0];
    }
}
*/
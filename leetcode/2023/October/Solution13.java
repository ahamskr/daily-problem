// 746. Min Cost Climbing Stairs

class Solution13 {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        dp[n-1]=cost[n-1];
        return Math.min(fun(0,cost,dp,n),fun(1,cost,dp,n));
    }
    int fun(int cur,int[] arr,int[] dp,int n){
        if(cur>=n) return 0;
        if(dp[cur]!=0) return dp[cur];
        return dp[cur]=arr[cur]+Math.min(fun(cur+1,arr,dp,n),fun(cur+2,arr,dp,n));
    }
}
// Stickler Thief

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp=new int[n];
        dp[n-1]=arr[n-1];
        return fun(0,n,arr,dp);
    }
    int fun(int cur,int n,int[] arr,int[] dp){
        if(cur>=n) return 0;
        if(dp[cur]!=0) return dp[cur];
        return dp[cur]=Math.max(arr[cur]+fun(cur+2,n,arr,dp),fun(cur+1,n,arr,dp));
    }

    /* Another solution

     if (n == 0) return 0;
        int prevMax = 0,currMax = 0;
        for (int i = 0; i < n; i++) {
            int maxAmount = Math.max(currMax, prevMax + arr[i]);
            prevMax = currMax;
            currMax = maxAmount;
        }
        return currMax;

     */
}
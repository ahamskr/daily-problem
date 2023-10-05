// 1512. Number of Good Pairs

class Solution03 {
    public int numIdenticalPairs(int[] nums) {
        int ans=0,frq[]=new int[101];
        for(int n:nums){
            ans+=frq[n]++;
        }
        return ans;
    }
}
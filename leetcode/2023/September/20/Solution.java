class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int num:nums) sum+=num;
        int n=nums.length,len=-1,curSum=0,i=0,j=0,target=sum-x;
        while(j<n){
            curSum+=nums[j++];
            while(curSum>target&&i<j) curSum-=nums[i++];
            if(curSum==target) len=Math.max(len,j-i);
        }
        return len==-1?-1:n-len;
    }
}
// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length,i=0;
        while(i<n){
            int idx=nums[i]-1;
            if(nums[i]!=nums[idx]){
                int tmp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=tmp;
            }
            else i++;
        }
        return nums[n-1];
    }
}
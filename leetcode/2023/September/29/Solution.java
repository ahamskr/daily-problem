class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;
        for(int i=0;i<nums.length-1;i++){
            inc&=nums[i] <= nums[i+1];
            dec&=nums[i] >= nums[i+1];
        }
        return inc||dec;
    }
}

/* Another solution
class Solution {
    public boolean isMonotonic(int[] nums) {
        return isInc(nums)||isDec(nums);
    }
    private boolean isInc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]) return false;
        }
        return true;
    }
    private boolean isDec(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]) return false;
        }
        return true;
    }
}
*/
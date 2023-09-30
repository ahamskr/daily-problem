// 456. 132 Pattern

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int last=Integer.MIN_VALUE,n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<last) return true;
            while(!st.empty()&&st.peek()<nums[i]){
                last=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
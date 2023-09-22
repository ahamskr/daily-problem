// 4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        if(m>n) return findMedianSortedArrays(nums2,nums1);
        int len=(m+n)/2;
        int lo=0,hi=m;
        while(true){
            int cut1=lo+hi>>1;
            int cut2=len-cut1;

            int left1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int left2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int right1=cut1==m?Integer.MAX_VALUE:nums1[cut1];
            int right2=cut2==n?Integer.MAX_VALUE:nums2[cut2];

            if(left1>right2) hi=cut1-1;
            else if(left2>right1) lo=cut1+1;
            else{
                if((m+n)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
                return Math.min(right1,right2);
            }
        }
    }
}
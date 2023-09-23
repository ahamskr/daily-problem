class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        // arr => 1,3,5,2,2
        if(n==1) return 1;
        long prev=arr[0],sum=0;
        for(long num:arr) sum+=num;
        // sum=13
        for(int i=1;i<n;i++){
            // At i=2, prev=4, 8=sum-5 so i+1 => 3 ans
            if(prev*2==sum-arr[i]) return i+1;
            prev+=arr[i];
        }
        return -1;
    }
}
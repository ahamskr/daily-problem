class Solution18_09_23{

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        /*
           8 => 1 0 0 0
           7 => 0 1 1 1
          => &  0 0 0 0
         */
        return (n&(n-1))==0&&n!=0;

        /* Another way to Solve this
            while(n!=0){
                if(n==1) return true;
                if(n%2!=0) return false;
                n/=2;
            }
            return false;
         */
    }

}
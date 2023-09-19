// Find first set bit

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){

        // Your code here
        int pos=0;
        while(n!=0){
            pos++;
            if((n&1)==1) return pos;
            n=n>>1;
        }
        return 0;
    }
}
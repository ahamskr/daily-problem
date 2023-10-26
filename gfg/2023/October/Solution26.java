// Minimum Operations

class Solution26
{
    public int minOperation(int n)
    {
        //code here.
        int ans=0;
        while(n!=0){
            if(n%2==0) n/=2;
            else n=n-1;
            ans++;
        }
        return ans;
    }
}
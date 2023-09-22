// First and last occurrences of x

class Solution
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(bs(arr,n-1,x,true));
        ans.add(bs(arr,n-1,x,false));
        return ans;
    }
    int bs(int[] arr,int hi,int target,boolean isFirst){
        int lo=0,ans=-1;
        while(lo<=hi){
            int mi=lo+hi>>1;
            if(arr[mi]==target){
                ans=mi;
                if(isFirst) hi=mi-1;
                else lo=mi+1;
            }
            else if(arr[mi]>target) hi=mi-1;
            else lo=mi+1;
        }
        return ans;
    }
}
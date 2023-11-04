// Find Transition Point

class Solution04 {
    int transitionPoint(int arr[], int n) {
        // code here
        int lo=0,hi=n-1,ans=-1;
        while(lo<=hi){
            int mi=lo+hi>>1;
            if(arr[mi]==1){
                ans=mi;
                hi=mi-1;
            }
            else lo=mi+1;
        }
        return ans;
    }
}
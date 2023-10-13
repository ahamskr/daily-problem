// 1095. Find in Mountain Array

class Solution12 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int lo=0,n=mountainArr.length(),hi=n-1,peak=-1;
        while(lo<=hi){
            int mi=lo+(hi-lo)/2;
            if(mountainArr.get(mi)<mountainArr.get(mi+1)) lo=mi+1;
            else hi=mi-1;
        }
        peak=lo;
        int ans=bs(0,peak,mountainArr,target,true);
        if(ans!=-1) return ans;
        ans=bs(peak+1,n-1,mountainArr,target,false);
        return ans;
    }
    int bs(int lo,int hi,MountainArray mountainArr,int target,boolean isInc){
        while(lo<=hi){
            int mi=lo+hi>>1;
            if(mountainArr.get(mi)==target) return mi;
            else if(mountainArr.get(mi)>target){
                if(isInc) hi=mi-1;
                else lo=mi+1;
            } 
            else{
                if(isInc) lo=mi+1;
                else hi=mi-1;
            } 
        }
        return -1;
    }
}
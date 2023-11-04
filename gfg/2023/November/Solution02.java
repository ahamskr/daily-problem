// Minimum distance between two numbers

class Solution02 {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int xLast=-1,yLast=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                xLast=i;
            }
            else if(a[i]==y){
                yLast=i;
            }
            if(xLast!=-1&&yLast!=-1) min=Math.min(min,Math.abs(xLast-yLast));
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
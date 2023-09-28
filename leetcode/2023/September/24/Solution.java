// 799. Champagne Tower

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] arr=new double[101][101];
        arr[0][0]=poured;
        for(int i=0;i<query_row;i++){
            for(int j=0;j<=query_glass;j++){
                double rem=Math.max(arr[i][j]-1.0,0);
                arr[i+1][j]+=rem/2.0;
                arr[i+1][j+1]+=rem/2.0;
            }
        }
        return Math.min(arr[query_row][query_glass],1.0);
    }
}
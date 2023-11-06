// Letters Collection

class Solution06{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        // code here
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<q;i++){
            int cur=0;
            if(queries[i][0]==1){
                for(int k=-1;k<=1;k++){
                    for(int j=-1;j<=1;j++){
                        int r=k+queries[i][1],c=j+queries[i][2];
                        if((k==-1||k==1||j==-1||j==1)&&r>=0&&c>=0&&r<n&&c<m) cur+=mat[r][c];
                    }
                }
            }
            else{
                for(int k=-2;k<=2;k++){
                    for(int j=-2;j<=2;j++){
                        int r=k+queries[i][1],c=j+queries[i][2];
                        if((k==-2||k==2||j==-2||j==2)&&r>=0&&c>=0&&r<n&&c<m) cur+=mat[r][c];
                    }
                }
            }
            ans.add(cur);
        }
        return ans;
    }
}
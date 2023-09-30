// Boolean Matrix

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // This is O(1) space complexity solution
        int n=matrix.length,m=matrix[0].length;
        boolean isRow=false;
        boolean isCol=false;
        for(int i=0;i<m;i++){
            if(matrix[0][i]==1){
               isRow=true; 
               break;
            } 
        }
        for(int j=0;j<n;j++){
            if(matrix[j][0]==1){
                isCol=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==1){
                    matrix[0][j]=1;
                    matrix[i][0]=1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j]==1||matrix[i][0]==1) matrix[i][j]=1;
            }
        }
        if(isRow){
            for(int i=0;i<m;i++) matrix[0][i]=1;
        }
        if(isCol){
            for(int j=0;j<n;j++) matrix[j][0]=1;
        }
    }
}
// Boundary traversal of matrix

class Solution01
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<m;j++) ans.add(matrix[0][j]);
        if(n==1) return ans;
        for(int i=1;i<n;i++) ans.add(matrix[i][m-1]);
        for(int j=m-2;j>=0;j--) ans.add(matrix[n-1][j]);
        if(m!=1){
            for(int i=n-2;i>0;i--) ans.add(matrix[i][0]);
        }
        return ans;
    }
}
// Sum of upper and lower triangles

class Solution07
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        int lower=0,upper=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j) lower+=matrix[i][j];
                if(i<=j) upper+=matrix[i][j];
            }
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(upper);
        ans.add(lower);
        return ans;
    }
}
// Find duplicates in an array
// Not an easy level problem

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int i=0;
        while(i<n){
            if(arr[i]==-1||arr[i]==i||arr[arr[i]]==-1) i++;
            else if(arr[arr[i]]==arr[i]) arr[arr[i++]]=-1;
            else {
                int tmp=arr[i];
                arr[i]=arr[arr[i]];
                arr[tmp]=tmp;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(i=0;i<n;i++){
            if(arr[i]==-1) ans.add(i);
        }
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}

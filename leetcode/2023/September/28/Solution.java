// 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2!=0&&arr[j]%2==0){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                i++;
                j--;
            }
            if(arr[i]%2==0) i++;
            if(arr[j]%2!=0) j--;
        }
        return arr;
    }
}
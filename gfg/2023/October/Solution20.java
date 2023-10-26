// Form a number divisible by 3 using array digits

class Solution20 {
    static int isPossible(int N, int arr[]) {
        // code here
        long sum=0;
        for(int n:arr) sum+=n;
        return sum%3==0?1:0;
    }
}
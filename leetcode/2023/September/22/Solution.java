// 392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,m=s.length(),j=0,n=t.length();
        while(j<n&&i<m){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==m;
    }
}
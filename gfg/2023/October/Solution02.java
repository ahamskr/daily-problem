// Number of distinct subsequences

class Solution02 {
    int distinctSubsequences(String S) {
        int MOD = 1000000007;
        int n = S.length();
        
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        
        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % MOD;
            
            if (lastOccurrence[S.charAt(i - 1) - 'a'] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[S.charAt(i - 1) - 'a']] + MOD) % MOD;
            }
            
            lastOccurrence[S.charAt(i - 1) - 'a'] = i - 1;
        }
        
        return dp[n];
    }
}
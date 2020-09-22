//Java Solution

class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        
        boolean[] dp = new boolean[n];
        Arrays.fill(dp, true);
        dp[0] = false;
        dp[1] = false;
        
        for (int i = 2; i * i < n; i++) {
            if (dp[i] == true) {
                for (int j = i; j * i < n; j++) {
                    dp[i * j] = false;
                }
            }
        }
        
        int count = 0;
        for (boolean b : dp) {
            if (b == true) {
                count++;
            }
        }
        
        return count;
    }
}
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        // One can reach ith step in one of the two ways:
        // Taking a single step from (i-1)th step
        // Taking a step of 22 from (i-2)th step.
        return dp[n];
    }
}
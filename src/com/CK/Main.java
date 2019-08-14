package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int numTrees(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i<=n; i++) {
            if (i == 1){
                dp[i] = 1;
                continue;
            }

            for (int root = 1; root <= i; root++ ){
                dp[i] += (dp[root - 1] * dp[i - root]);
            }
        }
        return dp[n];
    }
}
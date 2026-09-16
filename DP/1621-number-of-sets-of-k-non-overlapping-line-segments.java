class Solution {
    public int numberOfSets(int n, int k) {
        int MOD = 1_000_000_007;
        
        int N = n + k - 1;
        int K = 2 * k;

        long[][] C = new long[N + 1][K + 1];

        for (int i = 0; i <= N; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= Math.min(i, K); j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }

        return (int) C[N][K];
    }
}

class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        int res = 1;
        for (int d : b) {
            res = (pow(res, 10) * pow(a, d)) % MOD;
        }
        return res;
    }

    private int pow(int x, int n) {
        int ans = 1;
        x %= MOD;
        while (n > 0) {
            if ((n & 1) == 1) ans = (ans * x) % MOD;
            x = (x * x) % MOD;
            n >>= 1;
        }
        return ans;
    }
}

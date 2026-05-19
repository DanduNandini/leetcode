class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static void main (String[] args){
         Solution sol=new Solution();
        int n=1;
        System.out.println(sol.isPowerOfTwo(n));

    }
}
class Solution {
    public int maxProfit(int[] arr) {
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                num += arr[i] - arr[i - 1];
            }
        }
        return num;
    }
}

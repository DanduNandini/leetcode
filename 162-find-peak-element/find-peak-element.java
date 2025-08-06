class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            boolean leftSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (leftSmaller && rightSmaller) {
                return mid;
            }

            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            }
          
            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
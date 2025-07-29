class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ESum=n*(n+1)/2;
        int ASum=0;
        for(int num:nums){
            ASum+=num;

        }
        return ESum-ASum;
    }
}
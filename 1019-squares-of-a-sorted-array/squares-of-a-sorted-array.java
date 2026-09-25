class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i] * nums[i];
        }
        for(int k=0;k<nums.length-1;k++){
            for(int j=k+1;j<nums.length;j++){
                if(nums[k]>nums[j]){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
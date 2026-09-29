class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int gs=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cs<0){
                cs=0;
            }
            cs+=nums[i];
            
            if(cs>gs){
                gs=cs;
            }
        }
        return gs;
        
    }
}
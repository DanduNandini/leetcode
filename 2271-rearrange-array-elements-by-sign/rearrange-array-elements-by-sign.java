class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int [] res=new int[len];
        int even=0;
        int odd=1;
        for(int a:nums)
        {
            if(a>=0)
            {
                res[even]=a;
                even +=2;
            }
            else
            {
                res[odd]=a;
                odd+=2;
            }
        }
        return res;
    }
}
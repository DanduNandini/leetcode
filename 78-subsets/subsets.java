class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> sublist =new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0)
                  sublist.add(nums[j]);
            }
            res.add(sublist);
        }
        return res;
    }
}
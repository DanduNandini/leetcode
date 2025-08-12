 import java.util.HashMap;
 class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
            if (lastSeen.containsKey(nums[i])) {
                if (i - lastSeen.get(nums[i]) <= k) {
                    return true;
                }
            }
            lastSeen.put(nums[i], i); // update last index
        }
        
        return false;
    }
}
   

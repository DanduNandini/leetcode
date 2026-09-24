class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> setf = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        for(int x: nums1){
            setf.add(x);
        }
        for(int x: nums2){
            sets.add(x);
        }
        int answer1 = 0;
        int answer2 = 0;

        for(int x : nums1) {
            if(sets.contains(x)) {
                answer1++;
            }
        }

        for(int x : nums2) {
            if(setf.contains(x)) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
    }

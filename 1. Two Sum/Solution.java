// Time complexity:O(n)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get((nums[i]));
            if (index != null) {
                return new int[] { i, index };
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}
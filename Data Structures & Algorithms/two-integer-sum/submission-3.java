class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if (seen.containsKey(diff)) {
                return new int[]{seen.get(diff), j};
            }
            seen.put(nums[j], j);
        }
        return new int[]{};
    }
}

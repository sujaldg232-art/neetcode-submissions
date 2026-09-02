class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    int[] prefixMult = new int[n];
    int[] suffixMult = new int[n];

    prefixMult[0] = nums[0];
    suffixMult[n - 1] = nums[n - 1];

    for (int i = 1; i < n; i++) {
        int k = n - 1 - i;
        prefixMult[i] = prefixMult[i - 1] * nums[i];
        suffixMult[k] = suffixMult[k + 1] * nums[k];
    }

    int[] res = new int[n];
    res[0] = suffixMult[1];
    res[n - 1] = prefixMult[n - 2];

    for (int i = 1; i < n - 1; i++) {
        res[i] = prefixMult[i - 1] * suffixMult[i + 1];
    }

    return res;
    }
}  

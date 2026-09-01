class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
    int WithoutZeroes = 1;
    int numOfZeroes = 0;
    for(int i = 0; i < nums.length;i++){
        product *= nums[i];
        if(nums[i] != 0){
            WithoutZeroes *= nums[i];
        }

        if(nums[i] == 0){
            numOfZeroes++;
        }
    }

    int[] res = new int[nums.length];

    for(int i = 0; i < nums.length;i++){
        if(nums[i] == 0 ){
            if(numOfZeroes == 1 ) res[i] = WithoutZeroes;
            else res[i] = 0;
        }else {
            res[i] = product / nums[i];
        }
    }

    return res;
    }
}  

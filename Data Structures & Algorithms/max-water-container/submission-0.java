class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;

    int left = 0;
    int right = heights.length - 1;

    while(left < right){
        max = Math.max(max,(right - left)*Math.min(heights[left],heights[right]));
        if(heights[left] > heights[right]) right--;
        else if(heights[left] < heights[right])  left++;
        else {
            right--;
            left++;
        }
    }
    
    return max;        
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxSum = 0;
        
        while(left < right) {
            int currentMax = (right - left) * Math.min(heights[left], heights[right]);
            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
            if(currentMax > maxSum) maxSum = currentMax;
        }
        return maxSum;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        } else {
        Arrays.sort(nums);
        int previousMax = 1;
        int sequenceCount = 1;
        for(int i=0;i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
               continue;
            } else if(nums[i] != nums[i+1] && nums[i+1]-nums[i]==1){
                sequenceCount++;
            } else {
                if(sequenceCount > previousMax) {
                    previousMax = sequenceCount;
                }
                sequenceCount = 1;
            }
        }
        if(sequenceCount > previousMax) {
                    previousMax = sequenceCount;
                }
        return previousMax ;
        }
        
    }
}
